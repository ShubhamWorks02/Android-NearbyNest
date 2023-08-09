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

data class Feature(
    val architectureType: String,
    val cooling: Boolean,
    val coolingType: String? = null,
    val exteriorType: String? = null,
    val floorCount: Int,
    val foundationType: String? = null,
    val garage: Boolean,
    val garageType: String? = null,
    val heating: Boolean,
    val heatingType: String? = null,
    val pool: Boolean,
    val roofType: String? = null,
    val roomCount: Int,
    val unitCount: Int
)
