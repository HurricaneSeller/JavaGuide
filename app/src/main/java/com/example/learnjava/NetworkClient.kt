package com.example.learnjava

import android.util.Log
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import java.io.IOException

class NetworkClient(private val url: String) {
    val TAG = "moanbigking"
    fun connect() {
        try {
            val document: Document = Jsoup.connect(url).get()
//            Log.d(TAG, document.toString())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
