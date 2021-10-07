package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Placements extends AppCompatActivity {
    WebView placeWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placements);

        placeWeb=(WebView)findViewById(R.id.webplace);
        placeWeb.setWebViewClient(new WebViewClient());
        placeWeb.getSettings().setJavaScriptEnabled(true);

        placeWeb.loadUrl("https://bmsit.ac.in/training-and-placement");

    }

}
