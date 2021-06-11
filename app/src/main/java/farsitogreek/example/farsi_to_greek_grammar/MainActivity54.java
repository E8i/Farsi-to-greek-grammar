package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity54 extends AppCompatActivity {
    private Button b127,b128,perimeno1,perimeno2,perimeno3,perimeno4,perimeno5,perimeno6,perimeno7,perimeno8,perimeno9,
            perimeno10,perimeno11,perimeno12,perimeno13,perimeno14,perimeno15,perimeno16,perimeno17,perimeno18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main54);

        b127=findViewById(R.id.button127);
        b127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity54.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b128=findViewById(R.id.button178);
        b128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity54.this,MainActivity.class);
                startActivity(in);
            }
        });
        perimeno1=findViewById(R.id.perimeno1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.perimeno1);
        perimeno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        perimeno2=findViewById(R.id.perimeno2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.perimeno2);
        perimeno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        perimeno3=findViewById(R.id.perimeno3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.perimeno3);
        perimeno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        perimeno4=findViewById(R.id.perimeno4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.perimeno4);
        perimeno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        perimeno5=findViewById(R.id.perimeno5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.perimeno5);
        perimeno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        perimeno6=findViewById(R.id.perimeno6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.perimeno6);
        perimeno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        perimeno7=findViewById(R.id.perimeno7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.perimeno7);
        perimeno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        perimeno8=findViewById(R.id.perimeno8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.perimeno8);
        perimeno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        perimeno9=findViewById(R.id.perimeno9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.perimeno9);
        perimeno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        perimeno10=findViewById(R.id.perimeno10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.perimeno10);
        perimeno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        perimeno11=findViewById(R.id.perimeno11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.perimeno11);
        perimeno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        perimeno12=findViewById(R.id.perimeno12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.perimeno12);
        perimeno12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        perimeno13=findViewById(R.id.perimeno13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.perimeno13);
        perimeno13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        perimeno14=findViewById(R.id.perimeno14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.perimeno14);
        perimeno14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        perimeno15=findViewById(R.id.perimeno15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.perimeno15);
        perimeno15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        perimeno16=findViewById(R.id.perimeno16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.perimeno16);
        perimeno16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        perimeno17=findViewById(R.id.perimeno17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.perimeno17);
        perimeno17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        perimeno18=findViewById(R.id.perimeno18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.perimeno18);
        perimeno18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}