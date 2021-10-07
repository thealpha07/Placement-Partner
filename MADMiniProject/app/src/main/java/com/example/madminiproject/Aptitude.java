package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Aptitude extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
        ListView myListView= findViewById(R.id.myListView);

        ArrayList<String> aptitude= new ArrayList<String>();
        aptitude.add("Aptitude Test 1");
        aptitude.add("Aptitude Test 2");
        aptitude.add("Aptitude Test 3");
        aptitude.add("Aptitude Test 4");
        aptitude.add("Aptitude Test 5");
        aptitude.add("Aptitude Test 6");
        aptitude.add("Aptitude Test 7");
        aptitude.add("Aptitude Test 8");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,aptitude);

        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle1 =new Bundle();
                bundle1.putInt("pos",position);
                Intent intentForm= new Intent(getApplicationContext(),Form.class);
                intentForm.putExtra("data",bundle1);
                startActivity(intentForm);

            }
        });

    }

    public void BackHome(View view) {
        Intent intentHome= new Intent(getApplicationContext(),Homepage.class);
        startActivity(intentHome);
    }
}