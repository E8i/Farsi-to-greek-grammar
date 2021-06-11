package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity48 extends AppCompatActivity {
    private Button b109,b110,pezo1,pezo2,pezo3,pezo4,pezo5,pezo6,pezo7,pezo8,pezo9,
            pezo10,pezo11,pezo12,pezo13,pezo14,pezo15,pezo16,pezo17,pezo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main48);

        b109=findViewById(R.id.button109);
        b109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity48.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b110=findViewById(R.id.button110);
        b110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity48.this,MainActivity.class);
                startActivity(in);
            }
        });
        pezo1=findViewById(R.id.pezo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.pezo1);
        pezo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        pezo2=findViewById(R.id.pezo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.pezo2);
        pezo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        pezo3=findViewById(R.id.pezo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.pezo3);
        pezo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        pezo4=findViewById(R.id.pezo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.pezo4);
        pezo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        pezo5=findViewById(R.id.pezo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.pezo5);
        pezo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        pezo6=findViewById(R.id.pezo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.pezo6);
        pezo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        pezo7=findViewById(R.id.pezo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.pezo7);
        pezo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        pezo8=findViewById(R.id.pezo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.pezo8);
        pezo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        pezo9=findViewById(R.id.pezo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.pezo9);
        pezo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        pezo10=findViewById(R.id.pezo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.pezo10);
        pezo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        pezo11=findViewById(R.id.pezo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.pezo11);
        pezo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        pezo12=findViewById(R.id.pezo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.pezo12);
        pezo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        pezo13=findViewById(R.id.pezo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.pezo13);
        pezo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        pezo14=findViewById(R.id.pezo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.pezo14);
        pezo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        pezo15=findViewById(R.id.pezo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.pezo15);
        pezo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        pezo16=findViewById(R.id.pezo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.pezo16);
        pezo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        pezo17=findViewById(R.id.pezo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.pezo17);
        pezo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        pezo18=findViewById(R.id.pezo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.pezo18);
        pezo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



    }
}