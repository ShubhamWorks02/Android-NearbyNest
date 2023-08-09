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
package com.nearbynest.app.di

import com.nearbynest.app.data.repository.ImageRepository
import com.nearbynest.app.data.repository.ImageRepositoryImpl
import com.nearbynest.app.data.repository.UserRepository
import com.nearbynest.app.data.repository.UserRepositoryImpl
import com.nearbynest.app.utils.ResourceHelper
import com.nearbynest.app.utils.ResourceHelperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Defines all the classes that need to be provided in the scope of the app.
 * If they are singleton mark them as '@Singleton'.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class AppBindingModule {

    @Singleton
    @Binds
    abstract fun bindResourceHelper(impl: ResourceHelperImpl): ResourceHelper

    @Singleton
    @Binds
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository

    @Singleton
    @Binds
    abstract fun bindImageRepository(impl: ImageRepositoryImpl): ImageRepository
}
