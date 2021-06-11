package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity17 extends AppCompatActivity {
    private Button b67,trexo1,trexo2,trexo3,trexo4,trexo5,trexo6,trexo7,trexo8,trexo9,trexo10,
            trexo11,trexo12,trexo13,trexo14,trexo15,trexo16,trexo17,trexo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        b67=findViewById(R.id.button67);
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity17.this,MainActivity.class);
                startActivity(in);
            }
        });
        trexo1=findViewById(R.id.trexo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.trexo1);
        trexo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        trexo2=findViewById(R.id.trexo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.trexo2);
        trexo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        trexo3=findViewById(R.id.trexo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.trexo3);
        trexo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        trexo4=findViewById(R.id.trexo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.trexo4);
        trexo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        trexo5=findViewById(R.id.trexo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.trexo5);
        trexo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        trexo6=findViewById(R.id.trexo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.trexo6);
        trexo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        trexo7=findViewById(R.id.trexo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.trexo7);
        trexo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        trexo8=findViewById(R.id.trexo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.trexo8);
        trexo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        trexo9=findViewById(R.id.trexo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.trexo9);
        trexo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        trexo10=findViewById(R.id.trexo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.trexo10);
        trexo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        trexo11=findViewById(R.id.trexo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.trexo11);
        trexo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        trexo12=findViewById(R.id.trexo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.trexo12);
        trexo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        trexo13=findViewById(R.id.trexo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.trexo13);
        trexo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        trexo14=findViewById(R.id.trexo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.trexo14);
        trexo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        trexo15=findViewById(R.id.trexo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.trexo15);
        trexo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        trexo16=findViewById(R.id.trexo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.trexo16);
        trexo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        trexo17=findViewById(R.id.trexo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.trexo17);
        trexo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        trexo18=findViewById(R.id.trexo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.trexo18);
        trexo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}