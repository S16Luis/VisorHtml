package com.example.visorhtml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = findViewById(R.id.wbpagina);
        webview.loadUrl("file:///android_asset/Blogger/index.html");
        webview.getSettings().setJavaScriptEnabled(true);
        //Mejoras en proceso...
    }
}