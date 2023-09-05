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
import com.nearbynest.app.R
import com.nearbynest.app.data.remote.model.PropertyDetails
import com.nearbynest.app.ui.base.BaseRecyclerAdapter

class PropertyListAdapter : BaseRecyclerAdapter<PropertyDetails>() {
    override fun getLayoutIdForType(viewType: Int): Int = R.layout.item_property

    override fun onItemClick(view: View?, position: Int) {
        // Handle item click
    }

    override fun areItemsSame(firstItem: PropertyDetails, secondItem: PropertyDetails): Boolean {
        return firstItem == secondItem
    }

    override fun getFilteredResults(filteredText: String): ArrayList<PropertyDetails> {
        val filteredList = previousArrayList.filter { property ->
            property.addressLine1?.contains(filteredText, ignoreCase = true) == true ||
                    property.city?.contains(filteredText, ignoreCase = true) == true
        }
        return ArrayList(filteredList)
    }
}
