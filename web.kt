package com.example.user.algudsmosques

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class web : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webView.settings.javaScriptEnabled
       var url = ""
        webView.webViewClient=object :WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                url = request.toString()

                return false
            }
        }
        webView.loadUrl("https://info.wafa.ps/ar_page.aspx?id=9655")

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        return if (keyCode==KeyEvent.KEYCODE_BACK&&webView.canGoBack()){
            webView.goBack()
            true
        }else{
        super.onKeyDown(keyCode, event)
    }
}}
