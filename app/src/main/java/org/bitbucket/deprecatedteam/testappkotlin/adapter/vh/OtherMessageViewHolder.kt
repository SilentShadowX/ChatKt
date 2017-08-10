package org.bitbucket.deprecatedteam.testappkotlin.adapter.vh

import android.view.View
import kotlinx.android.synthetic.main.row_message_other_side.view.*
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.MessageObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.RowClickEvent
import org.bitbucket.deprecatedteam.testappkotlin.adapter.base.AbstractViewHolder

class OtherMessageViewHolder<T: MessageObject>(view: View): AbstractViewHolder<T>(view) {
    override fun bindItem(obj: T, listener: RowClickEvent<T>?) {
        itemView.otherTextMessage.text = obj.getMessage()
    }
}