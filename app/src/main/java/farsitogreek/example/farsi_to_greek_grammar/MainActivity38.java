package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity38 extends AppCompatActivity {
    private Button b80,b81,fonazo1,fonazo2,fonazo3,fonazo4,fonazo5,fonazo6,fonazo7,fonazo8,fonazo9,fonazo10,fonazo11,
            fonazo12,fonazo13,fonazo14,fonazo15,fonazo16,fonazo17,fonazo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main38);

        b80=findViewById(R.id.button80);
        b80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity38.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b81=findViewById(R.id.button81);
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity38.this,MainActivity.class);
                startActivity(in);
            }
        });
        fonazo1=findViewById(R.id.fonazo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.fonazo1);
        fonazo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        fonazo2=findViewById(R.id.fonazo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.fonazo2);
        fonazo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        fonazo3=findViewById(R.id.fonazo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.fonazo3);
        fonazo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        fonazo4=findViewById(R.id.fonazo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.fonazo4);
        fonazo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        fonazo5=findViewById(R.id.fonazo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.fonazo5);
        fonazo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        fonazo6=findViewById(R.id.fonazo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.fonazo6);
        fonazo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        fonazo7=findViewById(R.id.fonazo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.fonazo7);
        fonazo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        fonazo8=findViewById(R.id.fonazo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.fonazo8);
        fonazo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        fonazo9=findViewById(R.id.fonazo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.fonazo9);
        fonazo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        fonazo10=findViewById(R.id.fonazo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.fonazo10);
        fonazo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        fonazo11=findViewById(R.id.fonazo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.fonazo11);
        fonazo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        fonazo12=findViewById(R.id.fonazo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.fonazo12);
        fonazo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        fonazo13=findViewById(R.id.fonazo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.fonazo13);
        fonazo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        fonazo14=findViewById(R.id.fonazo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.fonazo14);
        fonazo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        fonazo15=findViewById(R.id.fonazo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.fonazo15);
        fonazo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        fonazo16=findViewById(R.id.fonazo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.fonazo16);
        fonazo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        fonazo17=findViewById(R.id.fonazo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.fonazo17);
        fonazo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        fonazo18=findViewById(R.id.fonazo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.fonazo18);
        fonazo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}