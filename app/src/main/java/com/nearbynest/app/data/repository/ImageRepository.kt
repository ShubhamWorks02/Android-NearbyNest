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
package com.nearbynest.app.data.repository

import com.nearbynest.app.data.remote.ImageApiService
import com.nearbynest.app.data.remote.apiresult.ApiResult
import com.nearbynest.app.data.remote.response.PropertyImageResponse
import javax.inject.Inject
import javax.inject.Singleton

interface ImageRepository {
    suspend fun getImages(
        apiKey: String = "38732269-f345afa503965f279b46427d9",
        query: String = "home",
        imageType: String = "photo",
        pretty: Boolean = true,
        category: String = "places"
    ): ApiResult<PropertyImageResponse>
}

@Singleton
class ImageRepositoryImpl @Inject constructor(
    private val apiService: ImageApiService
) : ImageRepository {
    override suspend fun getImages(
        apiKey: String,
        query: String,
        imageType: String,
        pretty: Boolean,
        category: String
    ): ApiResult<PropertyImageResponse> =
        apiService.getImages(apiKey, query, imageType, pretty, category)
}