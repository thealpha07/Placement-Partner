package com.example.madminiproject;

import java.util.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button loginnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        loginnn = (Button) findViewById(R.id.loginn);

    }

    public void loginevent(View view) {
        String[] words={"1by18is001","1by18is002","1by18is003","1by18is004","1by18is005"};
        List<String> wordsList =Arrays.asList(words);

        String user1 = username.getText().toString();
        String pass1 = password.getText().toString();
        if (wordsList.contains(user1) && pass1.equals("bms")) {
            System.out.println(user1+"success");
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            Bundle bundle =new Bundle();
            bundle.putString("User",user1);
            Intent intentLogin = new Intent (this, Homepage.class);
            intentLogin.putExtra("data",bundle);
            startActivity(intentLogin);
        }
        else {
            Toast.makeText(this, "Login Failed ", Toast.LENGTH_SHORT).show();
        }
    }
}