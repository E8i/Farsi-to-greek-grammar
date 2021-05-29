package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity59 extends AppCompatActivity {
    private Button b139,b140,boro1,boro2,boro3,boro4,boro5,boro6,boro7,boro8,boro9,boro10,boro11,
            boro12,boro13,boro14,boro15,boro16,boro17,boro18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main59);

        b139=findViewById(R.id.button139);
        b139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity59.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b140=findViewById(R.id.button140);
        b140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity59.this,MainActivity.class);
                startActivity(in);
            }
        });
        boro1=findViewById(R.id.boro1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.boro1);
        boro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        boro2=findViewById(R.id.boro2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.boro2);
        boro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        boro3=findViewById(R.id.boro3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.boro3);
        boro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        boro4=findViewById(R.id.boro4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.boro4);
        boro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        boro5=findViewById(R.id.boro5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.boro5);
        boro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        boro6=findViewById(R.id.boro6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.boro6);
        boro6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        boro7=findViewById(R.id.boro7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.boro7);
        boro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        boro8=findViewById(R.id.boro8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.boro8);
        boro8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        boro9=findViewById(R.id.boro9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.boro9);
        boro9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        boro10=findViewById(R.id.boro10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.boro10);
        boro10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        boro11=findViewById(R.id.boro11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.boro11);
        boro11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        boro12=findViewById(R.id.boro12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.boro12);
        boro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        boro13=findViewById(R.id.boro13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.boro13);
        boro13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        boro14=findViewById(R.id.boro14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.boro14);
        boro14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        boro15=findViewById(R.id.boro15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.boro15);
        boro15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        boro16=findViewById(R.id.boro16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.boro16);
        boro16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        boro17=findViewById(R.id.boro17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.boro17);
        boro17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        boro18=findViewById(R.id.boro18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.boro18);
        boro18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}