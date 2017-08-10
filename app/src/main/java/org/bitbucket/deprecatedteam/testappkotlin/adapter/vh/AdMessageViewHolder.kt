package org.bitbucket.deprecatedteam.testappkotlin.adapter.vh

import android.view.View
import kotlinx.android.synthetic.main.row_message_ad.view.*
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.AdvertRectObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.RowClickEvent
import org.bitbucket.deprecatedteam.testappkotlin.adapter.base.AbstractViewHolder

class AdMessageViewHolder<T: AdvertRectObject>(view: View): AbstractViewHolder<T>(view) {
    override fun bindItem(obj: T, listener: RowClickEvent<T>?) {
        itemView.adMessageView.setBackgroundColor(obj.getColor())
    }
}