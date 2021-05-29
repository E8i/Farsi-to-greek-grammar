package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity57 extends AppCompatActivity {
    private Button b136,b135,kherome1,kherome2,kherome3,kherome4,kherome5,kherome6,kherome7,kherome8,kherome9,
            kherome10,kherome11,kherome12,kherome13,kherome14,kherome15,kherome16,kherome17,kherome18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main57);

        b135=findViewById(R.id.button135);
        b135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity57.this,MainActivity.class);
                startActivity(in);
            }
        });

        b136=findViewById(R.id.button136);
        b136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity57.this,MainActivity50.class);
                startActivity(in);
            }
        });
        kherome1=findViewById(R.id.kherome1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.kherome1);
        kherome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        kherome2=findViewById(R.id.kherome2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.kherome2);
        kherome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        kherome3=findViewById(R.id.kherome3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.kherome3);
        kherome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        kherome4=findViewById(R.id.kherome4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.kherome4);
        kherome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        kherome5=findViewById(R.id.kherome5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.kherome5);
        kherome5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        kherome6=findViewById(R.id.kherome6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.kherome6);
        kherome6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        kherome7=findViewById(R.id.kherome7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.kherome7);
        kherome7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        kherome8=findViewById(R.id.kherome8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.kherome8);
        kherome8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        kherome9=findViewById(R.id.kherome9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.kherome9);
        kherome9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        kherome10=findViewById(R.id.kherome10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.kherome10);
        kherome10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        kherome11=findViewById(R.id.kherome11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.kherome11);
        kherome11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        kherome12=findViewById(R.id.kherome12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.kherome12);
        kherome12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        kherome13=findViewById(R.id.kherome13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.kherome13);
        kherome13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        kherome14=findViewById(R.id.kherome14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.kherome14);
        kherome14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        kherome15=findViewById(R.id.kherome15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.kherome15);
        kherome15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        kherome16=findViewById(R.id.kherome16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.kherome16);
        kherome16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        kherome17=findViewById(R.id.kherome17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.kherome17);
        kherome17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        kherome18=findViewById(R.id.kherome18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.kherome18);
        kherome18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}