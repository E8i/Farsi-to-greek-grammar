package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity58 extends AppCompatActivity {
    private Button b137,b138,agapo1,agapo2,agapo3,agapo4,agapo5,agapo6,agapo7,agapo8,agapo9,
            agapo10,agapo11,agapo12,agapo13,agapo14,agapo15,agapo16,agapo17,agapo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main58);

        b137=findViewById(R.id.button137);
        b137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity58.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b138=findViewById(R.id.button138);
        b138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity58.this,MainActivity.class);
                startActivity(in);
            }
        });
        agapo1=findViewById(R.id.agapo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.agapo1);
        agapo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        agapo2=findViewById(R.id.agapo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.agapo2);
        agapo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        agapo3=findViewById(R.id.agapo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.agapo3);
        agapo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        agapo4=findViewById(R.id.agapo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.agapo4);
        agapo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        agapo5=findViewById(R.id.agapo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.agapo5);
        agapo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        agapo6=findViewById(R.id.agapo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.agapo6);
        agapo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        agapo7=findViewById(R.id.agapo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.agapo7);
        agapo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        agapo8=findViewById(R.id.agapo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.agapo8);
        agapo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        agapo9=findViewById(R.id.agapo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.agapo9);
        agapo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        agapo10=findViewById(R.id.agapo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.agapo10);
        agapo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        agapo11=findViewById(R.id.agapo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.agapo11);
        agapo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        agapo12=findViewById(R.id.agapo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.agapo12);
        agapo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        agapo13=findViewById(R.id.agapo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.agapo13);
        agapo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        agapo14=findViewById(R.id.agapo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.agapo14);
        agapo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        agapo15=findViewById(R.id.agapo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.agapo15);
        agapo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        agapo16=findViewById(R.id.agapo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.agapo16);
        agapo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        agapo17=findViewById(R.id.agapo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.agapo17);
        agapo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        agapo18=findViewById(R.id.agapo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.agapo18);
        agapo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}