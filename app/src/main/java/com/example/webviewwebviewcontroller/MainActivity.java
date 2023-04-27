package com.example.webviewwebviewcontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        webView=findViewById(R.id.webView);
        webView.loadUrl("https://www.bbc.com/");
        webView.setWebViewClient(new WebViewController());



    }
}