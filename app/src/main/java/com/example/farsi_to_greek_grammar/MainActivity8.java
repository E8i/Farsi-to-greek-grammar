package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    private Button b58,akou1,akou2,akou3,akou4,akou5,akou6,akou7,akou8,akou9,akou10,
            akou11,akou12,akou13,akou14,akou15,akou16,akou17,akou18;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        b58=findViewById(R.id.button58);
        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity8.this,MainActivity.class);
                startActivity(in);
            }
        });
        akou1=findViewById(R.id.akou1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.akou1);
        akou1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        akou2=findViewById(R.id.akou2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.akou2);
        akou2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        akou3=findViewById(R.id.akou3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.akou3);
        akou3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        akou4=findViewById(R.id.akou4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.akou4);
        akou4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        akou5=findViewById(R.id.akou5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.akou5);
        akou5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        akou6=findViewById(R.id.akou6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.akou6);
        akou6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        akou7=findViewById(R.id.akou7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.akou7);
        akou7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        akou8=findViewById(R.id.akou8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.akou8);
        akou8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        akou9=findViewById(R.id.akou9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.akou9);
        akou9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        akou10=findViewById(R.id.akou10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.akou10);
        akou10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        akou11=findViewById(R.id.akou11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.akou11);
        akou11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        akou12=findViewById(R.id.akou12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.akou12);
        akou12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        akou13=findViewById(R.id.akou13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.akou13);
        akou13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        akou14=findViewById(R.id.akou14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.akou14);
        akou14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        akou15=findViewById(R.id.akou15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.akou15);
        akou15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        akou16=findViewById(R.id.akou16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.akou16);
        akou16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        akou17=findViewById(R.id.akou17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.akou17);
        akou17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        akou18=findViewById(R.id.akou18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.akou18);
        akou18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}