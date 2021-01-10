package com.example.cyberanimals2021;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Half;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalDetails extends AppCompatActivity {

    TextView polishTextView;
    TextView englishTextView;
    ImageView animalImageView;
    String tag;
    MediaPlayer mediaPlayer;
    ProgressBar progressBar;
    int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        tag = Animal.getTag();
        progressBar = findViewById(R.id.progressBar);
        polishTextView = findViewById(R.id.polishTextView);
        englishTextView = findViewById(R.id.englishTextView);
        animalImageView = findViewById(R.id.animalImageView);
        setImage();
        setName();

//        Toast toast = Toast.makeText(this, tag, Toast.LENGTH_LONG);
//        toast.show();
    }

    public void setName() {

        switch (tag) {
            case "0":
                polishTextView.setText(R.string.cat);
                englishTextView.setText(R.string.enCat);
                break;
            case "1":
                polishTextView.setText(R.string.dog);
                englishTextView.setText(R.string.enDog);
                break;
            case "2":
                polishTextView.setText(R.string.horse);
                englishTextView.setText(R.string.enHorse);
                break;
            case "3":
                polishTextView.setText(R.string.rooster);
                englishTextView.setText(R.string.enRooster);
                break;
            case "4":
                polishTextView.setText(R.string.duck);
                englishTextView.setText(R.string.enDuck);
                break;
            case "5":
                polishTextView.setText(R.string.cow);
                englishTextView.setText(R.string.enCow);
                break;
            case "6":
                polishTextView.setText(R.string.pig);
                englishTextView.setText(R.string.enPig);
                break;
            case "7":
                polishTextView.setText(R.string.goat);
                englishTextView.setText(R.string.enGoat);
                break;
            case "8":
                polishTextView.setText(R.string.sheep);
                englishTextView.setText(R.string.enSheep);
                break;
        }
    }

    public void setImage() {
        switch (tag) {
            case "0":
                animalImageView.setImageResource(R.drawable.catphoto);
                break;
            case "1":
                animalImageView.setImageResource(R.drawable.dogphoto);
                break;
            case "2":
                animalImageView.setImageResource(R.drawable.horsephoto);
                break;
            case "3":
                animalImageView.setImageResource(R.drawable.roosterphoto);
                break;
            case "4":
                animalImageView.setImageResource(R.drawable.duckphoto);
                break;
            case "5":
                animalImageView.setImageResource(R.drawable.cowphoto);
                break;
            case "6":
                animalImageView.setImageResource(R.drawable.pigphoto);
                break;
            case "7":
                animalImageView.setImageResource(R.drawable.goatphoto);
                break;
            case "8":
                animalImageView.setImageResource(R.drawable.sheepphoto);
                break;
        }
    }

    public void duration(final MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        duration = mediaPlayer.getDuration();
        progressBar.setMax(duration);


        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                    progressBar.setProgress(mediaPlayer.getCurrentPosition());
                    handler.postDelayed(this, 50);
            }

        };
        handler.postDelayed(runnable, 0);
    }

    public void end() {
        if (mediaPlayer.getCurrentPosition() == duration) {
            progressBar.setProgress(0);
        }
    }



    public void listen(View view) {
        switch (tag) {
            case "0":
                mediaPlayer = MediaPlayer.create(this, R.raw.cat);
                duration(mediaPlayer);
                mediaPlayer.start();
                end();
                break;
            case "1":
                mediaPlayer = MediaPlayer.create(this, R.raw.dog);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "2":
                mediaPlayer = MediaPlayer.create(this, R.raw.horse);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "3":
                mediaPlayer = MediaPlayer.create(this, R.raw.rooster);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "4":
                mediaPlayer = MediaPlayer.create(this, R.raw.duck);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "5":
                mediaPlayer = MediaPlayer.create(this, R.raw.cow);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "6":
                mediaPlayer = MediaPlayer.create(this, R.raw.pig);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "7":
                mediaPlayer = MediaPlayer.create(this, R.raw.goat);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
            case "8":
                mediaPlayer = MediaPlayer.create(this, R.raw.sheep);
                duration(mediaPlayer);
                mediaPlayer.start();
                break;
        }
    }
}