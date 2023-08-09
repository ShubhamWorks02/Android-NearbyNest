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

import android.view.View
import androidx.databinding.ViewDataBinding
import com.nearbynest.app.R
import com.nearbynest.app.data.fakedata.PropertyDetails
import com.nearbynest.app.data.remote.response.ImageInfo
import com.nearbynest.app.databinding.ItemPropertyBinding
import com.nearbynest.app.ui.base.BaseRecyclerAdapter

class PropertyListAdapter : BaseRecyclerAdapter<PropertyDetails>() {
    var imageList: List<ImageInfo> = emptyList()
    override fun getLayoutIdForType(viewType: Int): Int = R.layout.item_property

    override fun onItemClick(view: View?, position: Int) {
        // Handle item click
    }

    override fun areItemsSame(firstItem: PropertyDetails, secondItem: PropertyDetails): Boolean {
        return firstItem == secondItem
    }

    override fun getFilteredResults(filteredText: String): ArrayList<PropertyDetails> {
        val filteredList = ArrayList<PropertyDetails>()
        for (property in previousArrayList) {
            if ((property.addressLine1?.contains(filteredText, ignoreCase = true) == true) || (property.city?.contains(filteredText, ignoreCase = true) == true)) {
                filteredList.add(property)
            }
        }
        return filteredList
    }

    override fun setDataForListItem(
        binding: ViewDataBinding,
        data: PropertyDetails,
        position: Int
    ) {
        super.setDataForListItem(binding, data, position)
        (binding as? ItemPropertyBinding)?.image = imageList.getOrNull(position)
    }
}
