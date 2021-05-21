package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {
    private Button b64,kleo1,kleo2,kleo3,kleo4,kleo5,kleo6,kleo7,kleo8,kleo9,kleo10,
            kleo11,kleo12,kleo13,kleo14,kleo15,kleo16,kleo17,kleo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        b64=findViewById(R.id.button64);
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity14.this,MainActivity.class);
                startActivity(in);
            }
        });
        kleo1=findViewById(R.id.kleo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.gleo1);
        kleo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        kleo2=findViewById(R.id.kleo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.gleo2);
        kleo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        kleo3=findViewById(R.id.kleo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.gleo3);
        kleo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        kleo4=findViewById(R.id.kleo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.gleo4);
        kleo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        kleo5=findViewById(R.id.kleo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.gleo5);
        kleo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        kleo6=findViewById(R.id.kleo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.gleo6);
        kleo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        kleo7=findViewById(R.id.kleo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.gleo7);
        kleo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        kleo8=findViewById(R.id.kleo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.gleo8);
        kleo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        kleo9=findViewById(R.id.kleo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.gleo9);
        kleo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        kleo10=findViewById(R.id.kleo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.gleo10);
        kleo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        kleo11=findViewById(R.id.kleo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.gleo11);
        kleo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        kleo12=findViewById(R.id.kleo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.gleo12);
        kleo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        kleo13=findViewById(R.id.kleo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.gleo13);
        kleo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        kleo14=findViewById(R.id.kleo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.gleo14);
        kleo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        kleo15=findViewById(R.id.kleo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.gleo15);
        kleo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        kleo16=findViewById(R.id.kleo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.gleo16);
        kleo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        kleo17=findViewById(R.id.kleo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.gleo17);
        kleo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        kleo18=findViewById(R.id.kleo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.gleo18);
        kleo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}