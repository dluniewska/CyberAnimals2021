package com.example.cyberanimals2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimalDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        String tag = Animal.getTag();

        Toast toast = Toast.makeText(this, tag, Toast.LENGTH_LONG);
        toast.show();
    }
}