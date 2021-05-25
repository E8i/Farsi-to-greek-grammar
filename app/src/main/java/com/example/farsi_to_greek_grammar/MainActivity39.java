package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity39 extends AppCompatActivity {
    private Button b82,b83,dipsao1,dipsao2,dipsao3,dipsao4,dipsao5,dipsao6,dipsao7,dipsao8,dipsao9,
            dipsao10,dipsao11,dipsao12,dipsao13,dipsao14,dipsao15,dipsao16,dipsao17,dipsao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main39);

        b82=findViewById(R.id.button82);
        b82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b83=findViewById(R.id.button83);
        b83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity.class);
                startActivity(in);
            }
        });
        dipsao1=findViewById(R.id.dipsao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.dipsao1);
        dipsao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        dipsao2=findViewById(R.id.dipsao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.dipsao2);
        dipsao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        dipsao3=findViewById(R.id.dipsao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.dipsao3);
        dipsao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        dipsao4=findViewById(R.id.dipsao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.dipsao4);
        dipsao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        dipsao5=findViewById(R.id.dipsao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.dipsao5);
        dipsao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        dipsao6=findViewById(R.id.dipsao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.dipsao6);
        dipsao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        dipsao7=findViewById(R.id.dipsao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.dipsao7);
        dipsao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        dipsao8=findViewById(R.id.dipsao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.dipsao8);
        dipsao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        dipsao9=findViewById(R.id.dipsao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.dipsao9);
        dipsao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        dipsao10=findViewById(R.id.dipsao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.dipsao10);
        dipsao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        dipsao11=findViewById(R.id.dipsao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.dipsao11);
        dipsao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        dipsao12=findViewById(R.id.dipsao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.dipsao12);
        dipsao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        dipsao13=findViewById(R.id.dipsao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.dipsao13);
        dipsao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        dipsao14=findViewById(R.id.dipsao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.dipsao14);
        dipsao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        dipsao15=findViewById(R.id.dipsao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.dipsao15);
        dipsao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        dipsao16=findViewById(R.id.dipsao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.dipsao16);
        dipsao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        dipsao17=findViewById(R.id.dipsao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.dipsao17);
        dipsao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        dipsao18=findViewById(R.id.dipsao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.dipsao18);
        dipsao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



    }
}