package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity52 extends AppCompatActivity {
    private Button b121,b122,ponao1,ponao2,ponao3,ponao4,ponao5,ponao6,ponao7,ponao8,ponao9,
            ponao10,ponao11,ponao12,ponao13,ponao14,ponao15,ponao16,ponao17,ponao18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main52);

        b121=findViewById(R.id.button121);
        b121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity52.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b122=findViewById(R.id.button122);
        b122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity52.this,MainActivity.class);
                startActivity(in);
            }
        });
        ponao1=findViewById(R.id.ponao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.ponao1);
        ponao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        ponao2=findViewById(R.id.ponao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.ponao2);
        ponao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        ponao3=findViewById(R.id.ponao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.ponao3);
        ponao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        ponao4=findViewById(R.id.ponao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.ponao4);
        ponao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        ponao5=findViewById(R.id.ponao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.ponao5);
        ponao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        ponao6=findViewById(R.id.ponao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.ponao6);
        ponao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        ponao7=findViewById(R.id.ponao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.ponao7);
        ponao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        ponao8=findViewById(R.id.ponao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.ponao8);
        ponao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        ponao9=findViewById(R.id.ponao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.ponao9);
        ponao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        ponao10=findViewById(R.id.ponao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.ponao10);
        ponao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        ponao11=findViewById(R.id.ponao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.ponao11);
        ponao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        ponao12=findViewById(R.id.ponao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.ponao12);
        ponao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        ponao13=findViewById(R.id.ponao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.ponao13);
        ponao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        ponao14=findViewById(R.id.ponao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.ponao14);
        ponao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        ponao15=findViewById(R.id.ponao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.ponao15);
        ponao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        ponao16=findViewById(R.id.ponao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.ponao16);
        ponao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        ponao17=findViewById(R.id.ponao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.ponao17);
        ponao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        ponao18=findViewById(R.id.ponao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.ponao18);
        ponao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}