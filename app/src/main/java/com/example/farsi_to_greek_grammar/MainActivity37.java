package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity37 extends AppCompatActivity {
    private Button b78,b79,leo1,leo2,leo3,leo4,leo5,leo6,leo7,leo8,leo9,
            leo10,leo11,leo12,leo13,leo14,leo15,leo16,leo17,leo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main37);

        b78=findViewById(R.id.button78);
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity37.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b79=findViewById(R.id.button79);
        b79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity37.this,MainActivity.class);
                startActivity(in);
            }
        });
        leo1=findViewById(R.id.leo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.leo1);
        leo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        leo2=findViewById(R.id.leo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.leo2);
        leo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        leo3=findViewById(R.id.leo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.leo3);
        leo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        leo4=findViewById(R.id.leo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.leo4);
        leo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });leo5=findViewById(R.id.leo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.leo5);
        leo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        leo6=findViewById(R.id.leo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.leo6);
        leo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        leo7=findViewById(R.id.leo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.leo7);
        leo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        leo8=findViewById(R.id.leo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.leo8);
        leo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        leo9=findViewById(R.id.leo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.leo9);
        leo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        leo10=findViewById(R.id.leo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.leo10);
        leo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        leo11=findViewById(R.id.leo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.leo11);
        leo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        leo12=findViewById(R.id.leo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.leo12);
        leo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        leo13=findViewById(R.id.leo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.leo13);
        leo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        leo14=findViewById(R.id.leo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.leo14);
        leo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        leo15=findViewById(R.id.leo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.leo15);
        leo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        leo16=findViewById(R.id.leo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.leo16);
        leo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        leo17=findViewById(R.id.leo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.leo17);
        leo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        leo18=findViewById(R.id.leo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.leo18);
        leo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}