package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {
    private Button b60,kemame1,kemame2,kemame3,kemame4,kemame5,kemame6,kemame7,kemame8,kemame9,
            kemame10,kemame11,kemame12,kemame13,kemame14,kemame15,kemame16,kemame17,kemame18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        b60=findViewById(R.id.button60);
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity10.this,MainActivity.class);
                startActivity(in);
            }
        });
        kemame1=findViewById(R.id.kemame1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.kemame1);
        kemame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        kemame2=findViewById(R.id.kemame2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.kemame2);
        kemame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        kemame3=findViewById(R.id.kemame3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.kemame3);
        kemame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        kemame4=findViewById(R.id.kemame4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.kemame4);
        kemame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        kemame5=findViewById(R.id.kemame5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.kemame5);
        kemame5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        kemame6=findViewById(R.id.kemame6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.kemame6);
        kemame6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });


        kemame7=findViewById(R.id.kemame7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.kemame7);
        kemame7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        kemame8=findViewById(R.id.kemame8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.kemame8);
        kemame8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        kemame9=findViewById(R.id.kemame9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.kemame9);
        kemame9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        kemame10=findViewById(R.id.kemame10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.kemame10);
        kemame10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        kemame11=findViewById(R.id.kemame11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.kemame11);
        kemame11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        kemame12=findViewById(R.id.kemame12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.kemame12);
        kemame12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        kemame13=findViewById(R.id.kemame13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.kemame13);
        kemame13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        kemame14=findViewById(R.id.kemame14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.kemame14);
        kemame14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        kemame15=findViewById(R.id.kemame15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.kemame15);
        kemame15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        kemame16=findViewById(R.id.kemame16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.kemame16);
        kemame16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        kemame17=findViewById(R.id.kemame17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.kemame17);
        kemame17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        kemame18=findViewById(R.id.kemame18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.kemame18);
        kemame18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}