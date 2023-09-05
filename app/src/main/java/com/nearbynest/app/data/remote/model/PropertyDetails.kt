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
package com.nearbynest.app.data.remote.model

import com.nearbynest.app.data.remote.response.ImageInfo

data class PropertyDetails(
    val addressLine1: String,
    val city: String,
    val state: String,
    val zipCode: String,
    val formattedAddress: String? = null,
    val assessorID: String,
    val bedrooms: Int? = null,
    val county: String,
    val legalDescription: String? = null,
    val squareFootage: Int,
    val subdivision: String? = null,
    val yearBuilt: Int,
    val bathrooms: Int? = null,
    val lotSize: Int? = null,
    val propertyType: String? = null,
    val lastSaleDate: String? = null,
    val feature: Feature,
    val taxAssessments: List<TaxAssessment>? = null,
    val propertyTaxes: List<PropertyTax>? = null,
    val owner: Owner,
    val id: String,
    val longitude: Double,
    val latitude: Double,
    var image: ImageInfo
)
