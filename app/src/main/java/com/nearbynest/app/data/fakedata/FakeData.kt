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

object FakeData {
    val propertyDetailsList = listOf(
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
            features = Features(
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
            taxAssessment = mapOf(
                "2018" to TaxAssessment(value = 126510, land = 18760, improvements = 107750),
                "2019" to TaxAssessment(value = 135430, land = 23450, improvements = 111980),
                "2020" to TaxAssessment(value = 142610, land = 23450, improvements = 119160),
                "2021" to TaxAssessment(value = 163440, land = 45050, improvements = 118390),
                "2022" to TaxAssessment(value = 197600, land = 49560, improvements = 148040)
            ),
            propertyTaxes = mapOf(
                "2019" to PropertyTax(total = 2997),
                "2021" to PropertyTax(total = 3468)
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
            latitude = 29.475962
        ),
        PropertyDetails(
            addressLine1 = "5500 Grand Lake",
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
            features = Features(
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
            taxAssessment = mapOf(
                "2018" to TaxAssessment(value = 126510, land = 18760, improvements = 107750),
                "2019" to TaxAssessment(value = 135430, land = 23450, improvements = 111980),
                "2020" to TaxAssessment(value = 142610, land = 23450, improvements = 119160),
                "2021" to TaxAssessment(value = 163440, land = 45050, improvements = 118390),
                "2022" to TaxAssessment(value = 197600, land = 49560, improvements = 148040)
            ),
            propertyTaxes = mapOf(
                "2019" to PropertyTax(total = 2997),
                "2021" to PropertyTax(total = 3468)
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
            latitude = 29.475962
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
            features = Features(
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
            taxAssessment = mapOf(
                "2018" to TaxAssessment(value = 126510, land = 18760, improvements = 107750),
                "2019" to TaxAssessment(value = 135430, land = 23450, improvements = 111980),
                "2020" to TaxAssessment(value = 142610, land = 23450, improvements = 119160),
                "2021" to TaxAssessment(value = 163440, land = 45050, improvements = 118390),
                "2022" to TaxAssessment(value = 197600, land = 49560, improvements = 148040)
            ),
            propertyTaxes = mapOf(
                "2019" to PropertyTax(total = 2997),
                "2021" to PropertyTax(total = 3468)
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
            latitude = 29.475962
        )
    )
}
