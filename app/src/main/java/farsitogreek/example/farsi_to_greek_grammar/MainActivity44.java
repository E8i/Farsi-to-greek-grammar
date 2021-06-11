package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity44 extends AppCompatActivity {
    private Button b92,b93,katharizo1,katharizo2,katharizo3,katharizo4,katharizo5,katharizo6,katharizo7,katharizo8,katharizo9,
            katharizo10,katharizo11,katharizo12,katharizo13,katharizo14,katharizo15,katharizo16,katharizo17,katharizo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main44);

        b92=findViewById(R.id.button92);
        b92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity44.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b93=findViewById(R.id.button93);
        b93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity44.this,MainActivity.class);
                startActivity(in);
            }
        });
        katharizo1=findViewById(R.id.katharizo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.katharizo1);
        katharizo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        katharizo2=findViewById(R.id.katharizo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.katharizo2);
        katharizo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        katharizo3=findViewById(R.id.katharizo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.katharizo3);
        katharizo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        katharizo4=findViewById(R.id.katharizo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.katharizo4);
        katharizo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        katharizo5=findViewById(R.id.katharizo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.katharizo5);
        katharizo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        katharizo6=findViewById(R.id.katharizo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.katharizo6);
        katharizo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        katharizo7=findViewById(R.id.katharizo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.katharizo7);
        katharizo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        katharizo8=findViewById(R.id.katharizo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.katharizo8);
        katharizo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        katharizo9=findViewById(R.id.katharizo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.katharizo9);
        katharizo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        katharizo10=findViewById(R.id.katharizo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.katharizo10);
        katharizo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        katharizo11=findViewById(R.id.katharizo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.katharizo11);
        katharizo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        katharizo12=findViewById(R.id.katharizo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.katharizo12);
        katharizo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        katharizo13=findViewById(R.id.katharizo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.katharizo13);
        katharizo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        katharizo14=findViewById(R.id.katharizo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.katharizo14);
        katharizo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        katharizo15=findViewById(R.id.katharizo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.katharizo15);
        katharizo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        katharizo16=findViewById(R.id.katharizo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.katharizo16);
        katharizo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        katharizo17=findViewById(R.id.katharizo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.katharizo17);
        katharizo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        katharizo18=findViewById(R.id.katharizo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.katharizo18);
        katharizo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}