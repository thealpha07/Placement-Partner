package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Announcements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
    }

    public void newAnnouncement(View view) {
        Toast.makeText(this,"Add New Message",Toast.LENGTH_SHORT).show();
        Intent intentAddMsg= new Intent(getApplicationContext(),NewMessage.class);
        startActivity(intentAddMsg);
    }
}