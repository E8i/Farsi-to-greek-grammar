package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    private Button b56,perpato1,perpato2,perpato3,perpato4,perpato5,perpato6,perpato7,perpato8,
            perpato9,perpato10,perpato11,perpato12,perpato13,perpato14,perpato15,perpato16,perpato17,perpato18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        b56=findViewById(R.id.button56);
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity6.this,MainActivity.class);
                startActivity(in);
            }
        });
        perpato1=findViewById(R.id.perpato1);
        final  MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.perpato1);
        perpato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        perpato2=findViewById(R.id.perpato2);
        final  MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.perpato2);
        perpato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        perpato3=findViewById(R.id.perpato3);
        final  MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.perpato3);
        perpato3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        perpato4=findViewById(R.id.perpato4);
        final  MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.perpato4);
        perpato4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        perpato5=findViewById(R.id.perpato5);
        final  MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.perpato5);
        perpato5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        perpato6=findViewById(R.id.perpato6);
        final  MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.perpato6);
        perpato6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        perpato7=findViewById(R.id.perpato7);
        final  MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.perpato7);
        perpato7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        perpato8=findViewById(R.id.perpato8);
        final  MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.perpato8);
        perpato8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        perpato9=findViewById(R.id.perpato9);
        final  MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.perpato9);
        perpato9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        perpato10=findViewById(R.id.perpato10);
        final  MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.perpato10);
        perpato10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        perpato11=findViewById(R.id.perpato11);
        final  MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.perpato11);
        perpato11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        perpato12=findViewById(R.id.perpato12);
        final  MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.perpato12);
        perpato12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        perpato13=findViewById(R.id.perpato13);
        final  MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.perpato13);
        perpato13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        perpato14=findViewById(R.id.perpato14);
        final  MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.perpato14);
        perpato14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        perpato15=findViewById(R.id.perpato15);
        final  MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.perpato15);
        perpato15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        perpato16=findViewById(R.id.perpato16);
        final  MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.perpato16);
        perpato16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        perpato17=findViewById(R.id.perpato17);
        final  MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.perpato17);
        perpato17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        perpato18=findViewById(R.id.perpato18);
        final  MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.perpato18);
        perpato18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}