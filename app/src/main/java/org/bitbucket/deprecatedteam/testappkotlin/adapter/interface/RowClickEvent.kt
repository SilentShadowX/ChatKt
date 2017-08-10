package org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`

import org.bitbucket.deprecatedteam.testappkotlin.adapter.base.AbstractItem

interface RowClickEvent<in T: AbstractItem> {
    fun onRowClick(item: T)
}