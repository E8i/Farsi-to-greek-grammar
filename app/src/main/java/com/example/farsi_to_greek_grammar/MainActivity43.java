package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity43 extends AppCompatActivity {
    private Button b90,b91,fovoume1,fovoume2,fovoume3,fovoume4,fovoume5,fovoume6,fovoume7,fovoume8,fovoume9,
            fovoume10,fovoume11,fovoume12,fovoume13,fovoume14,fovoume15,fovoume16,fovoume17,fovoume18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main43);

        b90=findViewById(R.id.button90);
        b90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity43.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b91=findViewById(R.id.button91);
        b91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity43.this,MainActivity.class);
                startActivity(in);
            }
        });
        fovoume1=findViewById(R.id.fovoume1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.fovoume1);
        fovoume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        fovoume2=findViewById(R.id.fovoume2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.fovoume2);
        fovoume2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        fovoume3=findViewById(R.id.fovoume3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.fovoume3);
        fovoume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        fovoume4=findViewById(R.id.fovoume4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.fovoume4);
        fovoume4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        fovoume5=findViewById(R.id.fovoume5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.fovoume5);
        fovoume5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        fovoume6=findViewById(R.id.fovoume6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.fovoume6);
        fovoume6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        fovoume7=findViewById(R.id.fovoume7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.fovoume7);
        fovoume7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        fovoume8=findViewById(R.id.fovoume8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.fovoume8);
        fovoume8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        fovoume9=findViewById(R.id.fovoume9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.fovoume9);
        fovoume9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        fovoume10=findViewById(R.id.fovoume10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.fovoume10);
        fovoume10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        fovoume11=findViewById(R.id.fovoume11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.fovoume11);
        fovoume11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        fovoume12=findViewById(R.id.fovoume12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.fovoume12);
        fovoume12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        fovoume13=findViewById(R.id.fovoume13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.fovoume13);
        fovoume13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        fovoume14=findViewById(R.id.fovoume14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.fovoume14);
        fovoume14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        fovoume15=findViewById(R.id.fovoume15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.fovoume15);
        fovoume15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        fovoume16=findViewById(R.id.fovoume16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.fovoume16);
        fovoume16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        fovoume17=findViewById(R.id.fovoume17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.fovoume17);
        fovoume17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        fovoume18=findViewById(R.id.fovoume18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.fovoume18);
        fovoume18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}