package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity32 extends AppCompatActivity {
    private Button b69,eftasa1,eftasa2,eftasa3,eftasa4,eftasa5,eftasa6,eftasa7,eftasa8,eftasa9,
            eftasa10,eftasa11,eftasa12,eftasa13,eftasa14,eftasa15,eftasa16,eftasa17,eftasa18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        b69=findViewById(R.id.button69);
        b69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity32.this,MainActivity21.class);
                startActivity(in);
            }
        });
        eftasa1=findViewById(R.id.eftasa1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.eftasa1);
        eftasa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        eftasa2=findViewById(R.id.eftasa2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.eftasa2);
        eftasa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        eftasa3=findViewById(R.id.eftasa3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.eftasa3);
        eftasa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        eftasa4=findViewById(R.id.eftasa4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.eftasa4);
        eftasa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        eftasa5=findViewById(R.id.eftasa5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.eftasa5);
        eftasa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        eftasa6=findViewById(R.id.eftasa6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.eftasa6);
        eftasa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        eftasa7=findViewById(R.id.eftasa7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.eftasa7);
        eftasa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        eftasa8=findViewById(R.id.eftasa8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.eftasa8);
        eftasa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        eftasa9=findViewById(R.id.eftasa9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.eftasa9);
        eftasa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        eftasa10=findViewById(R.id.eftasa10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.eftasa10);
        eftasa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        eftasa11=findViewById(R.id.eftasa11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.eftasa11);
        eftasa11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        eftasa12=findViewById(R.id.eftasa12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.eftasa12);
        eftasa12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        eftasa13=findViewById(R.id.eftasa13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.eftasa13);
        eftasa13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        eftasa14=findViewById(R.id.eftasa14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.eftasa14);
        eftasa14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        eftasa15=findViewById(R.id.eftasa15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.eftasa15);
        eftasa15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        eftasa16=findViewById(R.id.eftasa16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.eftasa16);
        eftasa16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        eftasa17=findViewById(R.id.eftasa17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.eftasa17);
        eftasa17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        eftasa18=findViewById(R.id.eftasa18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.eftasa18);
        eftasa18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}