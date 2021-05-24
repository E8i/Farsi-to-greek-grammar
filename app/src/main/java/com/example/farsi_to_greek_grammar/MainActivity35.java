package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity35 extends AppCompatActivity {
    private Button b74,b75,agorazo1,agorazo2,agorazo3,agorazo4,agorazo5,agorazo6,agorazo7,agorazo8,agorazo9,
            agorazo10,agorazo11,agorazo12,agorazo13,agorazo14,agorazo15,agorazo16,agorazo17,agorazo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main35);

        b74=findViewById(R.id.button74);
        b74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity35.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b75=findViewById(R.id.button75);
        b75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity35.this,MainActivity.class);
                startActivity(in);
            }
        });
        agorazo1=findViewById(R.id.agorazo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.agorazo1);
        agorazo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        agorazo2=findViewById(R.id.agorazo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.agorazo2);
        agorazo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        agorazo3=findViewById(R.id.agorazo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.agorazo3);
        agorazo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        agorazo4=findViewById(R.id.agorazo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.agorazo4);
        agorazo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        agorazo5=findViewById(R.id.agorazo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.agorazo5);
        agorazo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        agorazo6=findViewById(R.id.agorazo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.agorazo6);
        agorazo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        agorazo7=findViewById(R.id.agorazo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.agorazo7);
        agorazo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        agorazo8=findViewById(R.id.agorazo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.agorazo8);
        agorazo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        agorazo9=findViewById(R.id.agorazo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.agorazo9);
        agorazo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        agorazo10=findViewById(R.id.agorazo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.agorazo10);
        agorazo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        agorazo11=findViewById(R.id.agorazo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.agorazo11);
        agorazo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        agorazo12=findViewById(R.id.agorazo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.agorazo12);
        agorazo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        agorazo13=findViewById(R.id.agorazo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.agorazo13);
        agorazo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        agorazo14=findViewById(R.id.agorazo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.agorazo14);
        agorazo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        agorazo15=findViewById(R.id.agorazo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.agorazo15);
        agorazo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        agorazo16=findViewById(R.id.agorazo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.agorazo16);
        agorazo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        agorazo17=findViewById(R.id.agorazo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.agorazo17);
        agorazo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        agorazo18=findViewById(R.id.agorazo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.agorazo18);
        agorazo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



    }
}