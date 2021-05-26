package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity42 extends AppCompatActivity {
    private Button b88,b89,poulao1,poulao2,poulao3,poulao4,poulao5,poulao6,poulao7,poulao8,poulao9,
            poulao10,poulao11,poulao12,poulao13,poulao14,poulao15,poulao16,poulao17,poulao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);

        b88=findViewById(R.id.button88);
        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b89=findViewById(R.id.button89);
        b89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity.class);
                startActivity(in);
            }
        });
        poulao1=findViewById(R.id.poulao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.poulao1);
        poulao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        poulao2=findViewById(R.id.poulao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.poulao2);
        poulao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        poulao3=findViewById(R.id.poulao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.poulao3);
        poulao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        poulao4=findViewById(R.id.poulao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.poulao4);
        poulao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        poulao5=findViewById(R.id.poulao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.poulao5);
        poulao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        poulao6=findViewById(R.id.poulao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.poulao6);
        poulao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        poulao7=findViewById(R.id.poulao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.poulao7);
        poulao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        poulao8=findViewById(R.id.poulao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.poulao8);
        poulao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        poulao9=findViewById(R.id.poulao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.poulao9);
        poulao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        poulao10=findViewById(R.id.poulao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.poulao10);
        poulao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        poulao11=findViewById(R.id.poulao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.poulao11);
        poulao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        poulao12=findViewById(R.id.poulao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.poulao12);
        poulao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        poulao13=findViewById(R.id.poulao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.poulao13);
        poulao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        poulao14=findViewById(R.id.poulao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.poulao14);
        poulao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        poulao15=findViewById(R.id.poulao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.poulao15);
        poulao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        poulao16=findViewById(R.id.poulao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.poulao16);
        poulao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        poulao17=findViewById(R.id.poulao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.poulao17);
        poulao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        poulao18=findViewById(R.id.poulao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.poulao18);
        poulao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}