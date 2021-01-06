package com.example.cyberanimals2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private final int TIMEOUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent helloIntent = new Intent(MainActivity.this, LogoActivity.class);
                startActivity(helloIntent);
                finish();
            }
        }, TIMEOUT);



    }

}