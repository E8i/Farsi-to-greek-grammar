package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity31 extends AppCompatActivity {
    private Button b68,eida1,eida2,eida3,eida4,eida5,eida6,eida7,eida8,eida9,eida10,
            eida11,eida12,eida13,eida14,eida15,eida16,eida17,eida18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);

        b68=findViewById(R.id.button68);
        b68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity31.this,MainActivity21.class);
                startActivity(in);
            }
        });
        eida1=findViewById(R.id.eida1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.eida1);
        eida1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        eida2=findViewById(R.id.eida2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.eida2);
        eida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        eida3=findViewById(R.id.eida3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.eida3);
        eida3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        eida4=findViewById(R.id.eida4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.eida4);
        eida4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        eida5=findViewById(R.id.eida5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.eida5);
        eida5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        eida6=findViewById(R.id.eida6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.eida6);
        eida6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        eida7=findViewById(R.id.eida7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.eida7);
        eida7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        eida8=findViewById(R.id.eida8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.eida8);
        eida8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        eida9=findViewById(R.id.eida9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.eida9);
        eida9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        eida10=findViewById(R.id.eida10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.eida10);
        eida10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        eida11=findViewById(R.id.eida11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.eida11);
        eida11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        eida12=findViewById(R.id.eida12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.eida12);
        eida12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        eida13=findViewById(R.id.eida13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.eida13);
        eida13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        eida14=findViewById(R.id.eida14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.eida14);
        eida14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        eida15=findViewById(R.id.eida15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.eida15);
        eida15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        eida16=findViewById(R.id.eida16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.eida16);
        eida16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        eida17=findViewById(R.id.eida17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.eida17);
        eida17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        eida18=findViewById(R.id.eida18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.eida18);
        eida18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}