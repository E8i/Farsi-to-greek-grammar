package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
    private Button b59,gelo1,gelo2,gelo3,gelo4,gelo5,gelo6,gelo7,gelo8,gelo9,
            gelo10,gelo11,gelo12,gelo13,gelo14,gelo15,gelo16,gelo17,gelo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        b59=findViewById(R.id.button59);
        b59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity9.this,MainActivity.class);
                startActivity(in);
            }
        });
        gelo1=findViewById(R.id.gelo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.gelo1);
        gelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        gelo2=findViewById(R.id.gelo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.gelo2);
        gelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        gelo3=findViewById(R.id.gelo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.gelo3);
        gelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        gelo4=findViewById(R.id.gelo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.gelo4);
        gelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        gelo5=findViewById(R.id.gelo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.gelo5);
        gelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        gelo6=findViewById(R.id.gelo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.gelo6);
        gelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        gelo7=findViewById(R.id.gelo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.gelo7);
        gelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        gelo8=findViewById(R.id.gelo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.gelo8);
        gelo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        gelo9=findViewById(R.id.gelo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.gelo9);
        gelo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        gelo10=findViewById(R.id.gelo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.gelo10);
        gelo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        gelo11=findViewById(R.id.gelo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.gelo11);
        gelo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        gelo12=findViewById(R.id.gelo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.gelo12);
        gelo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        gelo13=findViewById(R.id.gelo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.gelo13);
        gelo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        gelo14=findViewById(R.id.gelo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.gelo14);
        gelo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        gelo15=findViewById(R.id.gelo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.gelo15);
        gelo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        gelo16=findViewById(R.id.gelo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.gelo16);
        gelo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        gelo17=findViewById(R.id.gelo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.gelo17);
        gelo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        gelo18=findViewById(R.id.gelo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.gelo18);
        gelo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
    }
}