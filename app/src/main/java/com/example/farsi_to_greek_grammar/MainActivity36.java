package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity36 extends AppCompatActivity {
    private Button b76,b77,doulevo1,doulevo2,doulevo3,doulevo4,doulevo5,doulevo6,doulevo7,doulevo8,doulevo9,doulevo10,
            doulevo11,doulevo12,doulevo13,doulevo14,doulevo15,doulevo16,doulevo17,doulevo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main36);

        b76=findViewById(R.id.button76);
        b76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity36.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b77=findViewById(R.id.button77);
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity36.this,MainActivity.class);
                startActivity(in);
            }
        });
        doulevo1=findViewById(R.id.doulevo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.doulevo1);
        doulevo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        doulevo2=findViewById(R.id.doulevo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.doulevo2);
        doulevo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        doulevo3=findViewById(R.id.doulevo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.doulevo3);
        doulevo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        doulevo4=findViewById(R.id.doulevo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.doulevo4);
        doulevo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        doulevo5=findViewById(R.id.doulevo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.doulevo5);
        doulevo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        doulevo6=findViewById(R.id.doulevo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.doulevo6);
        doulevo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        doulevo7=findViewById(R.id.doulevo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.doulevo7);
        doulevo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        doulevo8=findViewById(R.id.doulevo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.doulevo8);
        doulevo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        doulevo9=findViewById(R.id.doulevo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.doulevo9);
        doulevo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        doulevo10=findViewById(R.id.doulevo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.doulevo10);
        doulevo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        doulevo11=findViewById(R.id.doulevo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.doulevo11);
        doulevo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        doulevo12=findViewById(R.id.doulevo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.doulevo12);
        doulevo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        doulevo13=findViewById(R.id.doulevo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.doulevo13);
        doulevo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        doulevo14=findViewById(R.id.doulevo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.doulevo14);
        doulevo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        doulevo15=findViewById(R.id.doulevo15);
        final MediaPlayer mediaPlayer15= MediaPlayer.create(this,R.raw.doulevo15);
        doulevo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        doulevo16=findViewById(R.id.doulevo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.doulevo16);
        doulevo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        doulevo17=findViewById(R.id.doulevo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.doulevo17);
        doulevo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        doulevo18=findViewById(R.id.doulevo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.doulevo18);
        doulevo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}