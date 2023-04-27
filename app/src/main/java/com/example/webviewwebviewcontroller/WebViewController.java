package com.example.webviewwebviewcontroller;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

//Custom Class to Load the urls in our own App instead of transitioning to another External App;
public class WebViewController extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String request) {
        view.loadUrl(request);
        return true;
    }
}
