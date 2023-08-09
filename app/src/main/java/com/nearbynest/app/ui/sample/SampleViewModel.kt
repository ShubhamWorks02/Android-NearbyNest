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
package com.nearbynest.app.ui.sample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nearbynest.app.data.remote.response.User
import com.nearbynest.app.data.repository.UserRepository
import com.nearbynest.app.di.IoDispatcher
import com.nearbynest.app.di.MainDispatcher
import com.nearbynest.app.ui.base.BaseViewModel
import com.nearbynest.app.utils.extension.onError
import com.nearbynest.app.utils.extension.onException
import com.nearbynest.app.utils.extension.onSuccess
import com.nearbynest.app.utils.result.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel for [com.nearbynest.app.ui.sample.SampleActivity]
 */
@HiltViewModel
class SampleViewModel @Inject constructor(
    private val userRepository: UserRepository,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    @MainDispatcher private val mainDispatcher: CoroutineDispatcher
) : BaseViewModel() {

    private val _onNewUserList = MutableLiveData<Event<List<User>>>()
    val onNewUserList: LiveData<Event<List<User>>>
        get() = _onNewUserList

    private val _isLoadingPage = MutableLiveData<Boolean>()
    val isLoadingPage: LiveData<Boolean>
        get() = _isLoadingPage

    private val _showShimmer = MutableLiveData<Boolean>()
    val showShimmer: LiveData<Boolean>
        get() = _showShimmer

    private var currentPage = 0

    init {
        loadMoreUsers()
    }

    fun loadMoreUsers() {
        _isLoadingPage.value = true
        currentPage += 1

        if (currentPage == 1) {
            _showShimmer.value = true
        }

        viewModelScope.launch(ioDispatcher) {
            userRepository
                .loadUsers(currentPage)
                .onSuccess {
                    withContext(mainDispatcher) {
                        _isLoadingPage.value = false
                        _onNewUserList.value = Event(it.results)
                        if (currentPage == 1) {
                            _showShimmer.value = false
                        }
                    }
                }.onError { code, message ->
                    Timber.e(code.toString() + message)
                    withContext(mainDispatcher) { handleApiFailure() }
                }.onException {
                    Timber.e(it.message)
                    withContext(mainDispatcher) { handleApiFailure() }
                }
        }
    }

    /**
     * Handle the failure occurring in API call
     */
    private fun handleApiFailure() {
        _isLoadingPage.value = false
        if (currentPage == 1) {
            _showShimmer.value = false
        }
        currentPage -= 1 // Revert increased count
    }
}
