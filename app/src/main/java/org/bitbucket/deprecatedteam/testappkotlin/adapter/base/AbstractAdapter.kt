package org.bitbucket.deprecatedteam.testappkotlin.adapter.base

import android.support.v7.widget.RecyclerView
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.RowClickEvent

abstract class AbstractAdapter
< T: AbstractItem>(
        var listener: RowClickEvent<T>? = null
): RecyclerView.Adapter<AbstractViewHolder<T>>() {

    var itemList = mutableListOf<T>()

    override fun onBindViewHolder(holder: AbstractViewHolder<T>?, position: Int) {
        holder?.bindItem(itemList[position], listener)
    }

    override fun getItemCount() = itemList.size


}

