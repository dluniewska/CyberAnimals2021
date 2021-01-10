package com.example.cyberanimals2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class LogoActivity extends AppCompatActivity {

    ArrayList<ImageView> animals;
    public ImageView catImageView;
    public ImageView dogImageView;
    public ImageView horseImageView;
    public ImageView roosterImageView;
    public ImageView duckImageView;
    public ImageView cowImageView;
    public ImageView pigImageView;
    public ImageView goatImageView;
    public ImageView sheepImageView;
    Animal farmAnimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        catImageView = findViewById(R.id.catImageView);
        dogImageView = findViewById(R.id.dogImageView);
        horseImageView = findViewById(R.id.horseImageView);
        roosterImageView = findViewById(R.id.roosterImageView);
        duckImageView = findViewById(R.id.duckImageView);
        cowImageView = findViewById(R.id.cowImageView);
        pigImageView = findViewById(R.id.pigImageView);
        goatImageView = findViewById(R.id.goatImageView);
        sheepImageView = findViewById(R.id.sheepImageView);

        animals.add(catImageView);
        animals.add(dogImageView);
        animals.add(horseImageView);
        animals.add(roosterImageView);
        animals.add(duckImageView);
        animals.add(cowImageView);
        animals.add(pigImageView);
        animals.add(goatImageView);
        animals.add(sheepImageView);



        for (final ImageView animal : animals) {
            animal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LogoActivity.this, AnimalDetails.class);
                    startActivity(intent);
                    farmAnimal = new Animal(animal.getTag().toString());
                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}