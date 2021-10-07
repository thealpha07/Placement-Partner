package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Form extends AppCompatActivity {
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Bundle bundle1 = getIntent().getBundleExtra("data");
        pos = bundle1.getInt("pos");
        if(pos==0){
            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfA8tA7QakAneKTRgiIqb4ED08tc8odBnFEvIsap1XpQmIQ6A/viewform?usp=sf_link");
        }else{
            Toast.makeText(this,pos,Toast.LENGTH_SHORT).show();
        }

    }
}