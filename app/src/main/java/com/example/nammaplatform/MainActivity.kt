package com.example.nammaplatform

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        // Enable JavaScript and storage
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccessFromFileURLs = true

        // Set up Kannada TTS
        tts = TextToSpeech(this) { status ->
            if (status == TextToSpeech.SUCCESS) {
                tts.setLanguage(Locale("kn", "IN"))
            }
        }

        // Expose AndroidTTS object to JavaScript
        webView.addJavascriptInterface(object {
            @JavascriptInterface
            fun speak(text: String) {
                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "kn_utt")
            }
        }, "AndroidTTS")

        webView.webViewClient = WebViewClient()
        webView.loadUrl("file:///android_asset/namma_platform_v2.html")
    }

    override fun onDestroy() {
        if (::tts.isInitialized) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}