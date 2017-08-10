package org.bitbucket.deprecatedteam.testappkotlin.adapter.model

import android.graphics.Color
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.AdvertRectObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.MessageTypes

class AdvertModel(val category: String): AdvertRectObject {
    override fun getViewType() = MessageTypes.AD.value

    override fun getColor(): Int {
        when(category) {
            "CAT_1" -> return Color.GREEN
            "CAT_2" -> return Color.RED
            else -> return Color.BLUE
        }
    }
}