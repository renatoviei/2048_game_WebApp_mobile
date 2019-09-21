package com.example.a2048webapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient as WebViewClient1

class NewGame : AppCompatActivity() {


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val mWebView = findViewById<WebView>(R.id.WebView)
        mWebView.loadUrl("file:///android_asset/www/index.html")
        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true
        mWebView.webChromeClient = WebChromeClient()
        WebView.setWebContentsDebuggingEnabled(false)

    }
}
