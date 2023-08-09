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

import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.nearbynest.app.R
import com.nearbynest.app.data.fakedata.FakeData
import com.nearbynest.app.databinding.FragmentPropertyListBinding
import com.nearbynest.app.ui.base.BaseFragment
import com.nearbynest.app.utils.extension.observeEvent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PropertyListFragment : BaseFragment<FragmentPropertyListBinding, PropertyListViewModel>() {

    override val viewModel: PropertyListViewModel by viewModels()

    override fun getLayoutResId(): Int = R.layout.fragment_property_list

    private lateinit var propertyListAdapter: PropertyListAdapter

    override fun initialize() {
        super.initialize()
        setupRecyclerView()
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()) return false
                propertyListAdapter.filter.filter(newText)
                return true
            }
        })
    }

    private fun setupRecyclerView() {
        binding.rvPropertyList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            propertyListAdapter = PropertyListAdapter()
            adapter = propertyListAdapter
        }

        viewModel.isItemArrived.observe(viewLifecycleOwner) {
            propertyListAdapter.removeAllItems()
            propertyListAdapter.addAllItem(ArrayList(FakeData.propertyDetailsList))
            propertyListAdapter.notifyDataSetChanged()
        }
    }

    override fun setupViewModel() {
        super.setupViewModel()
        viewModel.imageList.observeEvent(viewLifecycleOwner) {
            for ((j, i) in FakeData.propertyDetailsList.withIndex()) {
                i.image = it[j]
            }
            viewModel.isItemArrived.value = true
        }
    }
}
