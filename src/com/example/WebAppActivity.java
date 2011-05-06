package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebAppActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WebView wv = (WebView) findViewById(R.id.webview);

        // turns on JavaScript
        wv.getSettings().setJavaScriptEnabled(true);

        // allows page navigation to be handled in app, rather than opening web browser
        wv.setWebViewClient(new WebViewClient());
        
        wv.loadUrl("http://www.perficient.com");
    }
}
