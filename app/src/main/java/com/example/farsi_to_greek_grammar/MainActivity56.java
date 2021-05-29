package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity56 extends AppCompatActivity {
    private Button b133,b134,kourazome1,kourazome2,kourazome3,kourazome4,kourazome5,kourazome6,kourazome7,kourazome8,kourazome9,kourazome10,kourazome11,kourazome12
            ,kourazome13,kourazome14,kourazome15,kourazome16,kourazome17,kourazome18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main56);

        b133=findViewById(R.id.button133);
        b133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity56.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b134=findViewById(R.id.button134);
        b134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity56.this,MainActivity.class);
                startActivity(in);
            }
        });
        kourazome1=findViewById(R.id.kourazome1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.kourazome1);
        kourazome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        kourazome2=findViewById(R.id.kourazome2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.kourazome2);
        kourazome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        kourazome3=findViewById(R.id.kourazome3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.kourazome3);
        kourazome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        kourazome4=findViewById(R.id.kourazome4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.kourazome4);
        kourazome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        kourazome5=findViewById(R.id.kourazome5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.kourazome5);
        kourazome5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        kourazome6=findViewById(R.id.kourazome6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.kourazome6);
        kourazome6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        kourazome7=findViewById(R.id.kourazome7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.kourazome7);
        kourazome7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        kourazome8=findViewById(R.id.kourazome8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.kourazome8);
        kourazome8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        kourazome9=findViewById(R.id.kourazome9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.kourazome9);
        kourazome9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        kourazome10=findViewById(R.id.kourazome10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.kourazome10);
        kourazome10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        kourazome11=findViewById(R.id.kourazome11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.kourazome11);
        kourazome11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        kourazome12=findViewById(R.id.kourazome12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.kourazome12);
        kourazome12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        kourazome13=findViewById(R.id.kourazome13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.kourazome13);
        kourazome13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        kourazome14=findViewById(R.id.kourazome14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.kourazome14);
        kourazome14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        kourazome15=findViewById(R.id.kourazome15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.kourazome15);
        kourazome15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        kourazome16=findViewById(R.id.kourazome16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.kourazome16);
        kourazome16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        kourazome17=findViewById(R.id.kourazome17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.kourazome17);
        kourazome17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        kourazome18=findViewById(R.id.kourazome18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.kourazome18);
        kourazome18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}