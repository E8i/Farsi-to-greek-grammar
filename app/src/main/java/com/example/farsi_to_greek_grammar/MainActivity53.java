package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity53 extends AppCompatActivity {
    private Button b124,b125,meno1,meno2,meno3,meno4,meno5,meno6,meno7,meno8,meno9,meno10,meno11,
            meno12,meno13,meno14,meno15,meno16,meno17,meno18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main53);

        b124=findViewById(R.id.button124);
        b124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity53.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b125=findViewById(R.id.button125);
        b125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity53.this,MainActivity.class);
                startActivity(in);
            }
        });
        meno1=findViewById(R.id.meno1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.meno1);
        meno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        meno2=findViewById(R.id.meno2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.meno2);
        meno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        meno3=findViewById(R.id.meno3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.meno3);
        meno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        meno4=findViewById(R.id.meno4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.meno4);
        meno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        meno5=findViewById(R.id.meno5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.meno5);
        meno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        meno6=findViewById(R.id.meno6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.meno6);
        meno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        meno7=findViewById(R.id.meno7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.meno7);
        meno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        meno8=findViewById(R.id.meno8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.meno8);
        meno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        meno9=findViewById(R.id.meno9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.meno9);
        meno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        meno10=findViewById(R.id.meno10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.meno10);
        meno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        meno11=findViewById(R.id.meno11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.meno11);
        meno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        meno12=findViewById(R.id.meno12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.meno12);
        meno12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        meno13=findViewById(R.id.meno13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.meno13);
        meno13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        meno14=findViewById(R.id.meno14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.meno14);
        meno14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        meno15=findViewById(R.id.meno15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.meno15);
        meno15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        meno16=findViewById(R.id.meno16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.meno16);
        meno16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        meno17=findViewById(R.id.meno17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.meno17);
        meno17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        meno18=findViewById(R.id.meno18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.meno18);
        meno18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}