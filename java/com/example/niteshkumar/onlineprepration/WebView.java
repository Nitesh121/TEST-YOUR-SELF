package com.example.niteshkumar.onlineprepration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {
    android.webkit.WebView wv;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent i=getIntent();
        Bundle b=i.getExtras();
        url="file:///android_asset/"+b.getString("url")+".html";
        wv=(android.webkit.WebView)findViewById(R.id.web);
        wv.loadUrl(url);
        WebViewClient wvc=new WebViewClient();
        wv.setWebViewClient(wvc);
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
    }
}
