package org.bitbucket.deprecatedteam.testappkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import org.bitbucket.deprecatedteam.testappkotlin.R
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.ChatMessageObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.MessageTypes
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.RowClickEvent
import org.bitbucket.deprecatedteam.testappkotlin.adapter.base.AbstractAdapter
import org.bitbucket.deprecatedteam.testappkotlin.adapter.base.AbstractViewHolder
import org.bitbucket.deprecatedteam.testappkotlin.adapter.model.AdvertModel
import org.bitbucket.deprecatedteam.testappkotlin.adapter.model.MessageModel
import org.bitbucket.deprecatedteam.testappkotlin.adapter.vh.AdMessageViewHolder
import org.bitbucket.deprecatedteam.testappkotlin.adapter.vh.OtherMessageViewHolder
import org.bitbucket.deprecatedteam.testappkotlin.adapter.vh.UserMessageViewHolder


class ChatAdapter<T: ChatMessageObject>(
        listener: RowClickEvent<T>? = null
) : AbstractAdapter<T>(listener) {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): AbstractViewHolder<T>? {
        when(viewType) {
            MessageTypes.USER.value -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.row_message_user, parent, false)
                return UserMessageViewHolder<MessageModel>(view) as? AbstractViewHolder<T>
            }
            MessageTypes.OTHER.value -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.row_message_other_side, parent, false)
                return OtherMessageViewHolder<MessageModel>(view) as? AbstractViewHolder<T>
            }
            MessageTypes.AD.value -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.row_message_ad, parent, false)
                return AdMessageViewHolder<AdvertModel>(view) as? AbstractViewHolder<T>
            }
            else -> throw RuntimeException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return itemList[position].getViewType()
    }

}