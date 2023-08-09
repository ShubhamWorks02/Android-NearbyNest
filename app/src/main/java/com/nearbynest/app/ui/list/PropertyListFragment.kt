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
package com.nearbynest.app.ui.list

import androidx.fragment.app.viewModels
import com.nearbynest.app.R
import com.nearbynest.app.databinding.FragmentPropertyListBinding
import com.nearbynest.app.ui.base.BaseFragment

class PropertyListFragment : BaseFragment<FragmentPropertyListBinding, PropertyListViewModel>() {

    override val viewModel: PropertyListViewModel by viewModels()

    override fun getLayoutResId(): Int = R.layout.fragment_property_list
}
