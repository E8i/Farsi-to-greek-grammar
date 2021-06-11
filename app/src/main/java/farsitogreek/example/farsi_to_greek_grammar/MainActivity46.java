package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity46 extends AppCompatActivity {
    private Button b96,b97,dino1,dino2,dino3,dino4,dino5,dino6,dino7,dino8,dino9,dino10,
            dino11,dino12,dino13,dino14,dino15,dino16,dino17,dino18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main46);

        b96=findViewById(R.id.button96);
        b96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity46.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b97=findViewById(R.id.button97);
        b97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity46.this,MainActivity.class);
                startActivity(in);
            }
        });
        dino1=findViewById(R.id.dino1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.dino1);
        dino1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        dino2=findViewById(R.id.dino2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.dino2);
        dino2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        dino3=findViewById(R.id.dino3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.dino3);
        dino3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        dino4=findViewById(R.id.dino4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.dino4);
        dino4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        dino5=findViewById(R.id.dino5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.dino5);
        dino5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        dino6=findViewById(R.id.dino6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.dino6);
        dino6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        dino7=findViewById(R.id.dino7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.dino7);
        dino7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        dino8=findViewById(R.id.dino8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.dino8);
        dino8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        dino9=findViewById(R.id.dino9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.dino9);
        dino9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        dino10=findViewById(R.id.dino10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.dino10);
        dino10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        dino11=findViewById(R.id.dino11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.dino11);
        dino11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        dino12=findViewById(R.id.dino12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.dino12);
        dino12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        dino13=findViewById(R.id.dino13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.dino13);
        dino13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        dino14=findViewById(R.id.dino14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.dino14);
        dino14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        dino15=findViewById(R.id.dino15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.dino15);
        dino15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        dino16=findViewById(R.id.dino16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.dino16);
        dino16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        dino17=findViewById(R.id.dino17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.dino17);
        dino17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        dino18=findViewById(R.id.dino18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.dino18);
        dino18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}