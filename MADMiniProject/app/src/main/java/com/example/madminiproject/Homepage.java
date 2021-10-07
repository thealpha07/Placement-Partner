package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Bundle bundle = getIntent().getBundleExtra("data");
        user = bundle.getString("User");
        Toast.makeText(getBaseContext(),user,Toast.LENGTH_SHORT).show();
    }

    public void aptitudePage(View view) {
        Toast.makeText(getBaseContext(),"Aptitude Page Opened",Toast.LENGTH_SHORT).show();
        Intent intentAptitude= new Intent(getApplicationContext(),Aptitude.class);
        startActivity(intentAptitude);

    }

    public void dataStructuresPage(View view) {
        Toast.makeText(getBaseContext(),"DS Page Opened",Toast.LENGTH_SHORT).show();
        Intent intentDS= new Intent(getApplicationContext(),DataStructures.class);
        startActivity(intentDS);
    }

    public void placementPage(View view) {
        Toast.makeText(getBaseContext(),"Placement Page Opened",Toast.LENGTH_SHORT).show();
        Intent intentPlacement= new Intent(getApplicationContext(),Placements.class);
        startActivity(intentPlacement);
    }

    public void announcementPage(View view) {
        Toast.makeText(getBaseContext(),"Announcement Page Opened",Toast.LENGTH_SHORT).show();
        Intent intentAnnouncement= new Intent(getApplicationContext(),Announcements.class);
        startActivity(intentAnnouncement);
    }
}