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
package com.nearbynest.app.data.remote.response

import com.google.gson.annotations.SerializedName

data class ImageInfo(
    @SerializedName("id") val id: Int?,
    @SerializedName("pageURL") val pageURL: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("tags") val tags: String?,
    @SerializedName("previewURL") val previewURL: String?,
    @SerializedName("previewWidth") val previewWidth: Int?,
    @SerializedName("previewHeight") val previewHeight: Int?,
    @SerializedName("webformatURL") val webformatURL: String?,
    @SerializedName("webformatWidth") val webformatWidth: Int?,
    @SerializedName("webformatHeight") val webformatHeight: Int?,
    @SerializedName("largeImageURL") val largeImageURL: String?,
    @SerializedName("fullHDURL") val fullHDURL: String?,
    @SerializedName("imageURL") val imageURL: String?,
    @SerializedName("imageWidth") val imageWidth: Int?,
    @SerializedName("imageHeight") val imageHeight: Int?,
    @SerializedName("imageSize") val imageSize: Int?,
    @SerializedName("views") val views: Int?,
    @SerializedName("downloads") val downloads: Int?,
    @SerializedName("likes") val likes: Int?,
    @SerializedName("comments") val comments: Int?,
    @SerializedName("user_id") val userId: Int?,
    @SerializedName("user") val user: String?,
    @SerializedName("userImageURL") val userImageURL: String?
)
