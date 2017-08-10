package org.bitbucket.deprecatedteam.testappkotlin.adapter.base

import android.support.v7.widget.RecyclerView
import android.view.View
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.RowClickEvent

abstract class AbstractViewHolder<T: AbstractItem>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindItem(obj: T, listener: RowClickEvent<T>? = null)
}