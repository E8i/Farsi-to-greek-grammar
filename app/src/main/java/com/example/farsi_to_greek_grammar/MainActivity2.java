package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button b53,thelo,theleis,thelei,theloume,thelete,theloun,ethela,etheles,ethele,thelame,thelate,
            ethelan,thathelo,thatheleis,thathelei,thathelume,thathelete,thatheloun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b53=findViewById(R.id.button53);
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(in);
            }
        });

        thelo=findViewById(R.id.thelo);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.thelo1);
        thelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });

        theleis=findViewById(R.id.theleis);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.theleis2);
        theleis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mediaPlayer2.start();
            }
        });

        thelei=findViewById(R.id.thelei);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.thelei3);
        thelei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        theloume=findViewById(R.id.theloume);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.theloume4);
        theloume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        thelete=findViewById(R.id.thelete);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.thelete5);
        thelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        theloun=findViewById(R.id.theloun);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.theloun6);
        theloun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        ethela=findViewById(R.id.ethela);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.ethela7);
        ethela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        etheles=findViewById(R.id.etheles);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.etheles8);
        etheles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        ethele=findViewById(R.id.ethele);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.ethele9);
        ethele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        thelame=findViewById(R.id.thelame);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.thelame10);
        thelame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        thelate=findViewById(R.id.thelate);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.thelate11);
        thelate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        ethelan=findViewById(R.id.ethelan);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.ethelan12);
        ethelan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        thathelo=findViewById(R.id.thathelo);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.thathelo13);
        thathelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        thatheleis=findViewById(R.id.thatheleis);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.thatheleis14);
        thatheleis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        thathelei=findViewById(R.id.thathelei);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.thathelei15);
        thathelei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        thathelume=findViewById(R.id.thathelume);
        final MediaPlayer mediaPlayer116 = MediaPlayer.create(this,R.raw.thatheloume16);
        thathelume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer116.start();
            }
        });
        thathelete=findViewById(R.id.thathelete);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.thathelete17);
        thathelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        thatheloun=findViewById(R.id.thatheloun);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.thatheloun18);
        thatheloun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}