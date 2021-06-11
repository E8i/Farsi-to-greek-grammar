package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity55 extends AppCompatActivity {
    private Button b130,b131,diavazo1,diavazo2,diavazo3,diavazo4,diavazo5,diavazo6,diavazo7,diavazo8,
            diavazo9,diavazo10,diavazo11,diavazo12,diavazo13,diavazo14,diavazo15,diavazo16,diavazo17,diavazo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main55);

        b130=findViewById(R.id.button130);
        b130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity55.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b131=findViewById(R.id.button131);
        b131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity55.this,MainActivity.class);
                startActivity(in);
            }
        });
        diavazo1=findViewById(R.id.diavazo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.diavazo1);
        diavazo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        diavazo2=findViewById(R.id.diavazo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.diavazo2);
        diavazo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        diavazo3=findViewById(R.id.diavazo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.diavazo3);
        diavazo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        diavazo4=findViewById(R.id.diavazo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.diavazo4);
        diavazo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        diavazo5=findViewById(R.id.diavazo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.diavazo5);
        diavazo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        diavazo6=findViewById(R.id.diavazo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.diavazo6);
        diavazo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        diavazo7=findViewById(R.id.diavazo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.diavazo7);
        diavazo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        diavazo8=findViewById(R.id.diavazo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.diavazo8);
        diavazo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        diavazo9=findViewById(R.id.diavazo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.diavazo9);
        diavazo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        diavazo10=findViewById(R.id.diavazo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.diavazo10);
        diavazo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        diavazo11=findViewById(R.id.diavazo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.diavazo11);
        diavazo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });diavazo12=findViewById(R.id.diavazo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.diavazo12);
        diavazo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        diavazo13=findViewById(R.id.diavazo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.diavazo13);
        diavazo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        diavazo14=findViewById(R.id.diavazo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.diavazo14);
        diavazo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        diavazo15=findViewById(R.id.diavazo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.diavazo15);
        diavazo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        diavazo16=findViewById(R.id.diavazo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.diavazo16);
        diavazo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        diavazo17=findViewById(R.id.diavazo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.diavazo17);
        diavazo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        diavazo18=findViewById(R.id.diavazo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.diavazo18);
        diavazo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



    }
}