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

import com.nearbynest.app.data.remote.FireBaseService
import javax.inject.Inject
import javax.inject.Singleton

interface AuthRepository {
    fun login(email: String, password: String): Boolean
    fun register(email: String, password: String): Boolean
}

@Singleton
class AuthRepositoryImpl @Inject constructor(private val fireBaseService: FireBaseService) :
    AuthRepository {
    override fun login(email: String, password: String): Boolean =
        fireBaseService.login(email, password)

    override fun register(email: String, password: String): Boolean =
        fireBaseService.register(email, password)
}
