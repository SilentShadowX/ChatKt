package org.bitbucket.deprecatedteam.testappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.bitbucket.deprecatedteam.testappkotlin.adapter.ChatAdapter
import org.bitbucket.deprecatedteam.testappkotlin.adapter.`interface`.ChatMessageObject
import org.bitbucket.deprecatedteam.testappkotlin.adapter.model.AdvertModel
import org.bitbucket.deprecatedteam.testappkotlin.adapter.model.MessageModel

class MainActivity : AppCompatActivity() {


    val adapter by lazy {
        ChatAdapter<ChatMessageObject>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapterList = mutableListOf<ChatMessageObject>(
                MessageModel("msg 1", "U"),
                MessageModel("msg 2", "R"),
                AdvertModel("CAT_1"),
                AdvertModel("CAT_2"),
                MessageModel("msg 1", "U"),
                MessageModel("msg 2", "R")
        )
        adapter.itemList = adapterList
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
    }

}
