/**
 * Copyright COPYRIGHT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nearbynest.app.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nearbynest.app.BuildConfig
import com.nearbynest.app.data.remote.response.ImageInfo
import com.nearbynest.app.data.repository.ImageRepository
import com.nearbynest.app.di.IoDispatcher
import com.nearbynest.app.di.MainDispatcher
import com.nearbynest.app.ui.base.BaseViewModel
import com.nearbynest.app.utils.extension.onError
import com.nearbynest.app.utils.extension.onException
import com.nearbynest.app.utils.extension.onSuccess
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject
import com.nearbynest.app.utils.result.Event

@HiltViewModel
class PropertyListViewModel @Inject constructor(
    private val imageRepository: ImageRepository,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    @MainDispatcher private val mainDispatcher: CoroutineDispatcher
) : BaseViewModel() {
    private val _showShimmer = MutableLiveData<Boolean>(false)
    val showShimmer: LiveData<Boolean>
        get() = _showShimmer

    private val _imageList = MutableLiveData<Event<List<ImageInfo>>>()
    val imageList: LiveData<Event<List<ImageInfo>>>
        get() = _imageList

    val isItemArrived = MutableLiveData<Boolean>(false)

    init {
        getImages()
    }

    private fun getImages() {
        viewModelScope.launch(ioDispatcher) {
            imageRepository.getImages(BuildConfig.API_KEY).onSuccess { result ->
                withContext(mainDispatcher) {
                    result.hits?.let { _imageList.value = Event(it) }
                }
            }.onError { code, message ->
                Timber.e(code.toString() + message)
                withContext(mainDispatcher) {
                    // TODO: Implement error handling
                }
            }.onException {
                Timber.e(it.message)
                withContext(mainDispatcher) {
                    // TODO: Implement exception handling
                }
            }
        }
    }
}
