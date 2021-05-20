package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {
    private Button b62,eime1,eime2,eime3,eime4,eime5,eime6,eime7,eime8,eime9,eime10,eime11,
            eime12,eime13,eime14,eime15,eime16,eime17,eime18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        b62=findViewById(R.id.button62);
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity12.this,MainActivity.class);
                startActivity(in);
            }
        });
        eime1=findViewById(R.id.eime1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.eime1);
        eime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        eime2=findViewById(R.id.eime2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.eime2);
        eime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        eime3=findViewById(R.id.eime3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.eime3);
        eime3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        eime4=findViewById(R.id.eime4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.eime4);
        eime4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        eime5=findViewById(R.id.eime5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.eime5);
        eime5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        eime6=findViewById(R.id.eime6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.eime6);
        eime6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        eime7=findViewById(R.id.eime7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.eime7);
        eime7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        eime8=findViewById(R.id.eime8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.eime8);
        eime8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        eime9=findViewById(R.id.eime9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.eime9);
        eime9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        eime10=findViewById(R.id.eime10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.eime10);
        eime10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        eime11=findViewById(R.id.eime11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.eime11);
        eime11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        eime12=findViewById(R.id.eime12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.eime12);
        eime12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        eime13=findViewById(R.id.eime13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.eime13);
        eime13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        eime14=findViewById(R.id.eime14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.eime14);
        eime14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        eime15=findViewById(R.id.eime15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.eime15);
        eime15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        eime16=findViewById(R.id.eime16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.eime16);
        eime16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        eime17=findViewById(R.id.eime17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.eime17);
        eime17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        eime18=findViewById(R.id.eime18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.eime18);
        eime18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}