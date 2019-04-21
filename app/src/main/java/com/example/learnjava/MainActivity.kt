package com.example.learnjava

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebSettings
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val URL: String = "https://snailclimb.top/JavaGuide/#/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWebView(web_view)
        Thread(Runnable {
            val sample = NetworkClient(URL)
            sample.connect()
        }).start()
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun initWebView(webView: WebView) {
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.loadUrl(URL)
    }
}
