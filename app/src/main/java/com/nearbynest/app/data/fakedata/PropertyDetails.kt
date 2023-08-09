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
package com.nearbynest.app.data.fakedata

data class PropertyDetails(
    val addressLine1: String? = null,
    val city: String? = null,
    val state: String? = null,
    val zipCode: String? = null,
    val formattedAddress: String? = null,
    val assessorID: String? = null,
    val bedrooms: Int? = null,
    val county: String? = null,
    val legalDescription: String? = null,
    val squareFootage: Long? = null,
    val subdivision: String? = null,
    val yearBuilt: Long? = null,
    val bathrooms: Int? = null,
    val lotSize: Long? = null,
    val propertyType: String? = null,
    val lastSaleDate: String? = null,
    val features: Features? = null,
    val taxAssessment: Map<String, TaxAssessment>? = null,
    val propertyTaxes: Map<String, PropertyTax>? = null,
    val owner: Owner? = null,
    val id: String? = null,
    val longitude: Double? = null,
    val latitude: Double? = null
)
