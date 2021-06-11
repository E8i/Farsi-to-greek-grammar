package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity16 extends AppCompatActivity {
    private Button b66,pino1,pino2,pino3,pino4,pino5,pino6,pino7,pino8,pino9,pino10,
            pino11,pino12,pino13,pino14,pino15,pino16,pino17,pino18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        b66=findViewById(R.id.button66);
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity16.this,MainActivity.class);
                startActivity(in);
            }
        });
        pino1=findViewById(R.id.pino1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.pino1);
        pino1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        pino2=findViewById(R.id.pino2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.pino2);
        pino2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        pino3=findViewById(R.id.pino3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.pino3);
        pino3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        pino4=findViewById(R.id.pino4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.pino4);
        pino4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        pino5=findViewById(R.id.pino5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.pino5);
        pino5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        pino6=findViewById(R.id.pino6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.pino6);
        pino6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        pino7=findViewById(R.id.pino7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.pino7);
        pino7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        pino8=findViewById(R.id.pino8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.pino8);
        pino8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        pino9=findViewById(R.id.pino9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.pino9);
        pino9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        pino10=findViewById(R.id.pino10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.pino10);
        pino10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        pino11=findViewById(R.id.pino11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.pino11);
        pino11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        pino12=findViewById(R.id.pino12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.pino12);
        pino12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        pino13=findViewById(R.id.pino13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.pino13);
        pino13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        pino14=findViewById(R.id.pino14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.pino14);
        pino14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        pino15=findViewById(R.id.pino15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.pino15);
        pino15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        pino16=findViewById(R.id.pino16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.pino16);
        pino16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        pino17=findViewById(R.id.pino17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.pino17);
        pino17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        pino18=findViewById(R.id.pino18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.pino18);
        pino18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}