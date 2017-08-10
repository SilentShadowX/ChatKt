package org.bitbucket.deprecatedteam.testappkotlin.adapter.model

import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.MessageObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.MessageTypes

class MessageModel(
        val msg: String,
        val type: String
) : MessageObject {

    override fun getMessage(): String = msg
    override fun getViewType(): Int = if (type == "U") MessageTypes.USER.value else MessageTypes.OTHER.value
}
