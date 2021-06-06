package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity62 extends AppCompatActivity {

    private Button milao1,milao2,milao3,milao4,milao5,milao6,milao7,milao8,milao9,milao10,
            milao11,milao12,milao13,milao14,milao15,milao16,milao17,milao18,back1,home6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main62);

        back1=findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity62.this,MainActivity50.class);
                startActivity(in);
            }
        });
        home6=findViewById(R.id.home6);
        home6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity62.this,MainActivity.class);
                startActivity(in);
            }
        });
        milao1=findViewById(R.id.milao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.milao1);
        milao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        milao2=findViewById(R.id.milao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.milao2);
        milao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        milao3=findViewById(R.id.milao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.milao3);
        milao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        milao4=findViewById(R.id.milao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.milao4);
        milao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        milao5=findViewById(R.id.milao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.milao5);
        milao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        milao6=findViewById(R.id.milao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.milao6);
        milao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        milao7=findViewById(R.id.milao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.milao7);
        milao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        milao8=findViewById(R.id.milao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.milao8);
        milao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        milao9=findViewById(R.id.milao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.milao9);
        milao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        milao10=findViewById(R.id.milao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.milao10);
        milao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        milao11=findViewById(R.id.milao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.milao11);
        milao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        milao12=findViewById(R.id.milao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.milao12);
        milao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        milao13=findViewById(R.id.milao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.milao13);
        milao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        milao14=findViewById(R.id.milao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.milao14);
        milao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        milao15=findViewById(R.id.milao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.milao15);
        milao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        milao16=findViewById(R.id.milao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.milao16);
        milao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        milao17=findViewById(R.id.milao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.milao17);
        milao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        milao18=findViewById(R.id.milao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.milao18);
        milao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });





    }
}