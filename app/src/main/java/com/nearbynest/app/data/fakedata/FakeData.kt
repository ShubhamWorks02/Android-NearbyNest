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

import com.nearbynest.app.data.remote.model.Feature
import com.nearbynest.app.data.remote.model.MailingAddress
import com.nearbynest.app.data.remote.model.Owner
import com.nearbynest.app.data.remote.model.PropertyDetails
import com.nearbynest.app.data.remote.model.PropertyTax
import com.nearbynest.app.data.remote.model.TaxAssessment
import com.nearbynest.app.data.remote.response.ImageInfo

object FakeData {
    val propertyDetailsList = mutableListOf(
        PropertyDetails(
            addressLine1 = "5500 Grand Lake Dr",
            city = "San Antonio",
            state = "TX",
            zipCode = "78244",
            formattedAddress = "5500 Grand Lake Dr, San Antonio, TX 78244",
            assessorID = "05076-103-0500",
            bedrooms = 3,
            county = "Bexar",
            legalDescription = "B 5076A BLK 3 LOT 50",
            squareFootage = 1878,
            subdivision = "CONV A/S CODE",
            yearBuilt = 1973,
            bathrooms = 2,
            lotSize = 8843,
            propertyType = "Single Family",
            lastSaleDate = "2017-10-19T00:00:00.000Z",
            feature = Feature(
                architectureType = "Contemporary",
                cooling = true,
                coolingType = "Central",
                exteriorType = "Wood",
                floorCount = 1,
                foundationType = "Slab",
                garage = true,
                garageType = "Garage",
                heating = true,
                heatingType = "Forced Air",
                pool = true,
                roofType = "Asphalt",
                roomCount = 5,
                unitCount = 1
            ),
            taxAssessments = listOf(
                TaxAssessment(year = 2020, value = 126510, land = 18760, improvements = 107750),
                TaxAssessment(year = 2021, value = 126510, land = 18760, improvements = 107750),
                TaxAssessment(year = 2022, value = 126510, land = 18760, improvements = 107750)
            ),
            propertyTaxes = listOf(
                PropertyTax(year = 2022, total = 32),
                PropertyTax(year = 2021, total = 32),
                PropertyTax(year = 2020, total = 32)
            ),
            owner = Owner(
                names = listOf("MICHEAL ONEAL SMITH"),
                mailingAddress = MailingAddress(
                    id = "149-Weaver-Blvd,-Weaverville,-NC-28787",
                    addressLine1 = "149 Weaver Blvd",
                    city = "Weaverville",
                    state = "NC",
                    zipCode = "28787"
                )
            ),
            id = "5500-Grand-Lake-Dr,-San-Antonio,-TX-78244",
            longitude = -98.351442,
            latitude = 29.475962,
            image = ImageInfo(
                id = 581073,
                pageURL = "https://pixabay.com/photos/living-room-victorian-historic-581073/",
                type = "photo",
                tags = "living room, victorian, historic",
                previewURL = "https://cdn.pixabay.com/photo/2014/12/27/14/37/living-room-581073_150.jpg",
                previewWidth = 150,
                previewHeight = 96,
                webformatURL = "https://pixabay.com/get/ga17a10f1a32d4ec7641f2bca8a7f758b782082de9455c785031a0c2ab619fd6ad15d8d083af072e9b1a9d6c265cc10c6_640.jpg",
                webformatWidth = 640,
                webformatHeight = 412,
                largeImageURL = "https://pixabay.com/get/g7c8ef884f906430d4f5dbd0312315bdd05e8c7d40bc24ad6bc6af460974ae16c6a0b7b1c0a39c7bb8f8e9861573192e0a65b1fda9e5e03cafabed21f23d4dfa0_1280.jpg",
                imageWidth = 4184,
                imageHeight = 2698,
                imageSize = 2690934,
                views = 440205,
                downloads = 211037,
                likes = 1138,
                comments = 173,
                userId = 219264,
                user = "VinnyCiro",
                userImageURL = "https://cdn.pixabay.com/user/2015/05/06/21-32-36-388_250x250.jpg",
                fullHDURL = "",
                imageURL = ""
            )
        ),
        PropertyDetails(
            addressLine1 = "5500 Grand Lake Dr",
            city = "San Antonio",
            state = "TX",
            zipCode = "78244",
            formattedAddress = "5500 Grand Lake Dr, San Antonio, TX 78244",
            assessorID = "05076-103-0500",
            bedrooms = 3,
            county = "Bexar",
            legalDescription = "B 5076A BLK 3 LOT 50",
            squareFootage = 1878,
            subdivision = "CONV A/S CODE",
            yearBuilt = 1973,
            bathrooms = 2,
            lotSize = 8843,
            propertyType = "Single Family",
            lastSaleDate = "2017-10-19T00:00:00.000Z",
            feature = Feature(
                architectureType = "Contemporary",
                cooling = true,
                coolingType = "Central",
                exteriorType = "Wood",
                floorCount = 1,
                foundationType = "Slab",
                garage = true,
                garageType = "Garage",
                heating = true,
                heatingType = "Forced Air",
                pool = true,
                roofType = "Asphalt",
                roomCount = 5,
                unitCount = 1
            ),
            taxAssessments = listOf(
                TaxAssessment(year = 2020, value = 126510, land = 18760, improvements = 107750),
                TaxAssessment(year = 2021, value = 126510, land = 18760, improvements = 107750),
                TaxAssessment(year = 2022, value = 126510, land = 18760, improvements = 107750)
            ),
            propertyTaxes = listOf(
                PropertyTax(year = 2022, total = 32),
                PropertyTax(year = 2021, total = 32),
                PropertyTax(year = 2020, total = 32)
            ),
            owner = Owner(
                names = listOf("MICHEAL ONEAL SMITH"),
                mailingAddress = MailingAddress(
                    id = "149-Weaver-Blvd,-Weaverville,-NC-28787",
                    addressLine1 = "149 Weaver Blvd",
                    city = "Weaverville",
                    state = "NC",
                    zipCode = "28787"
                )
            ),
            id = "5500-Grand-Lake-Dr,-San-Antonio,-TX-78244",
            longitude = -98.351442,
            latitude = 29.475962,
            image = ImageInfo(
                id = 581073,
                pageURL = "https://pixabay.com/photos/living-room-victorian-historic-581073/",
                type = "photo",
                tags = "living room, victorian, historic",
                previewURL = "https://cdn.pixabay.com/photo/2014/12/27/14/37/living-room-581073_150.jpg",
                previewWidth = 150,
                previewHeight = 96,
                webformatURL = "https://pixabay.com/get/ga17a10f1a32d4ec7641f2bca8a7f758b782082de9455c785031a0c2ab619fd6ad15d8d083af072e9b1a9d6c265cc10c6_640.jpg",
                webformatWidth = 640,
                webformatHeight = 412,
                largeImageURL = "https://pixabay.com/get/g7c8ef884f906430d4f5dbd0312315bdd05e8c7d40bc24ad6bc6af460974ae16c6a0b7b1c0a39c7bb8f8e9861573192e0a65b1fda9e5e03cafabed21f23d4dfa0_1280.jpg",
                imageWidth = 4184,
                imageHeight = 2698,
                imageSize = 2690934,
                views = 440205,
                downloads = 211037,
                likes = 1138,
                comments = 173,
                userId = 219264,
                user = "VinnyCiro",
                userImageURL = "https://cdn.pixabay.com/user/2015/05/06/21-32-36-388_250x250.jpg",
                fullHDURL = "",
                imageURL = ""
            )
        )
    )
}
