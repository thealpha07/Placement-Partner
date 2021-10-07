package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DataStructures extends AppCompatActivity {
    ListView cbListView;
    WebView cbWebView;
    List<String> list;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        cbListView=findViewById(R.id.List);
        cbWebView=findViewById(R.id.web);

        final ArrayList<Object> list= new ArrayList<Object>();
        list.add("Basics of Algorithms:");

        list.add("Asymptomatic Analysis:");
        list.add("Greedy Algorithms:");
        list.add("Divide and Conquer:");
        list.add("Dynamic Programming:");

        arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        cbListView.setAdapter(arrayAdapter);
        cbListView.getSelectedItem();

        cbListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(parent);
                System.out.println(id);
                if(position==0)
                    cbWebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/algorithms_basics.htm");
                else if(position==1)
                    cbWebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/asymptotic_analysis.htm");
                else if(position==2)
                    cbWebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/greedy_algorithms.htm");
                if(position==3)
                    cbWebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/divide_and_conquer.htm");
                if(position==4)
                    cbWebView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/dynamic_programming.htm");
            }
        });

    }

    public void BackHome(View view) {
        Intent intentHome2= new Intent(getApplicationContext(),Homepage.class);
        startActivity(intentHome2);
    }
}