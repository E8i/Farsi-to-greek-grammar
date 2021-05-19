package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {
    private Button b61,pao1,pao2,pao3,pao4,pao5,pao6,pao7,pao8,pao9,pao10,
            pao11,pao12,pao13,pao14,pao15,pao16,pao17,pao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        b61=findViewById(R.id.button61);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity11.this,MainActivity.class);
                startActivity(in);
            }
        });
        pao1=findViewById(R.id.pao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.pao1);
        pao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        pao2=findViewById(R.id.pao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.pao2);
        pao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        pao3=findViewById(R.id.pao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.pao3);
        pao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        pao4=findViewById(R.id.pao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.pao4);
        pao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        pao5=findViewById(R.id.pao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.pao5);
        pao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        pao6=findViewById(R.id.pao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.pao6);
        pao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        pao7=findViewById(R.id.pao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.pao7);
        pao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        pao8=findViewById(R.id.pao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.pao8);
        pao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        pao9=findViewById(R.id.pao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.pao9);
        pao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        pao10=findViewById(R.id.pao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.pao10);
        pao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        pao11=findViewById(R.id.pao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.pao11);
        pao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        pao12=findViewById(R.id.pao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.pao12);
        pao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        pao13=findViewById(R.id.pao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.pao13);
        pao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        pao14=findViewById(R.id.pao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.pao14);
        pao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        pao15=findViewById(R.id.pao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.pao15);
        pao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        pao16=findViewById(R.id.pao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.pao16);
        pao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        pao17=findViewById(R.id.pao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.pao17);
        pao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        pao18=findViewById(R.id.pao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.pao18);
        pao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}