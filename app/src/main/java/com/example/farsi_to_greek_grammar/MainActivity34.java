package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity34 extends AppCompatActivity {
    private Button b72,b73,peinao1,peinao2,peinao3,peinao4,peinao5,peinao6,peinao7,peinao8,peinao9,peinao10,
            peinao11,peinao12,peinao13,peinao14,peinao15,peinao16,peinao17,peinao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);

        b72=findViewById(R.id.button72);
        b72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity34.this,MainActivity21.class);
                startActivity(in);
            }
        });
        b73=findViewById(R.id.button73);
        b73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity34.this,MainActivity.class);
                startActivity(in);
            }
        });
        peinao1=findViewById(R.id.peinao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.peinao1);
        peinao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        peinao2=findViewById(R.id.peinao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.peinao2);
        peinao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        peinao3=findViewById(R.id.peinao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.peinao3);
        peinao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        peinao4=findViewById(R.id.peinao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.peinao4);
        peinao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        peinao5=findViewById(R.id.peinao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.peinao5);
        peinao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        peinao6=findViewById(R.id.peinao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.peinao6);
        peinao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        peinao7=findViewById(R.id.peinao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.peinao7);
        peinao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        peinao8=findViewById(R.id.peinao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.peinao8);
        peinao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        peinao9=findViewById(R.id.peinao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.peinao9);
        peinao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        peinao10=findViewById(R.id.peinao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.peinao10);
        peinao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        peinao11=findViewById(R.id.peinao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.peinao11);
        peinao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        peinao12=findViewById(R.id.peinao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.peinao12);
        peinao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        peinao13=findViewById(R.id.peinao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.peinao13);
        peinao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        peinao14=findViewById(R.id.peinao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.peinao14);
        peinao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        peinao15=findViewById(R.id.peinao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.peinao15);
        peinao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        peinao16=findViewById(R.id.peinao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.peinao16);
        peinao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        peinao17=findViewById(R.id.peinao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.peinao17);
        peinao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        peinao18=findViewById(R.id.peinao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.peinao18);
        peinao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}