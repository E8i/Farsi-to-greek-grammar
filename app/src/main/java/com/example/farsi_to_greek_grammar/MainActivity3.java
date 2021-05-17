package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button b54,exo1,exo2,exo3,exo4,exo5,exo6,exo7,exo8,exo9,exo10,exo11,exo12,exo13,exo14,
            exo15,exo16,exo17,exo18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b54=findViewById(R.id.button54);
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(in);
            }
        });
        exo1=findViewById(R.id.exo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.exo1);
        exo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        exo2=findViewById(R.id.exo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.exo2);
        exo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        exo3=findViewById(R.id.exo3);
        final  MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.exo3);
        exo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        exo4=findViewById(R.id.exo4);
        final  MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.exo4);
        exo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        exo5=findViewById(R.id.exo5);
        final  MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.exo5);
        exo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        exo6=findViewById(R.id.exo6);
        final  MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.exo6);
        exo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        exo7=findViewById(R.id.exo7);
        final  MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.exo7);
        exo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        exo8=findViewById(R.id.exo8);
        final  MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.exo8);
        exo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        exo9=findViewById(R.id.exo9);
        final  MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.exo9);
        exo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        exo10=findViewById(R.id.exo10);
        final  MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.exo10);
        exo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        exo11=findViewById(R.id.exo11);
        final  MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.exo11);
        exo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        exo12=findViewById(R.id.exo12);
        final  MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.exo12);
        exo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        exo13=findViewById(R.id.exo13);
        final  MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.exo13);
        exo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        exo14=findViewById(R.id.exo14);
        final  MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.exo14);
        exo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        exo15=findViewById(R.id.exo15);
        final  MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.exo15);
        exo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        exo16=findViewById(R.id.exo16);
        final  MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.exo16);
        exo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        exo17=findViewById(R.id.exo17);
        final  MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.exo17);
        exo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        exo18=findViewById(R.id.exo18);
        final  MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.exo18);
        exo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
    }
}