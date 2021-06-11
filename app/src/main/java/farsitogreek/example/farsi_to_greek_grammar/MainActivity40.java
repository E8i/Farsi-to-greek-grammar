package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity40 extends AppCompatActivity {
    private Button b84,b85,gerizo1,gerizo2,gerizo3,gerizo4,gerizo5,gerizo6,gerizo7,gerizo8,gerizo9,
            gerizo10,gerizo11,gerizo12,gerizo13,gerizo14,gerizo15,gerizo16,gerizo17,gerizo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main40);

        b84=findViewById(R.id.button84);
        b84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity40.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b85=findViewById(R.id.button85);
        b85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity40.this,MainActivity.class);
                startActivity(in);
            }
        });
        gerizo1=findViewById(R.id.gerizo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.gerizo1);
        gerizo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        gerizo2=findViewById(R.id.gerizo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.gerizo2);
        gerizo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        gerizo3=findViewById(R.id.gerizo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.gerizo3);
        gerizo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        gerizo4=findViewById(R.id.gerizo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.gerizo4);
        gerizo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        gerizo5=findViewById(R.id.gerizo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.gerizo5);
        gerizo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        gerizo6=findViewById(R.id.gerizo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.gerizo1);
        gerizo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        gerizo7=findViewById(R.id.gerizo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.gerizo7);
        gerizo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        gerizo8=findViewById(R.id.gerizo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.gerizo8);
        gerizo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        gerizo9=findViewById(R.id.gerizo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.gerizo9);
        gerizo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        gerizo10=findViewById(R.id.gerizo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.gerizo10);
        gerizo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        gerizo11=findViewById(R.id.gerizo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.gerizo11);
        gerizo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        gerizo12=findViewById(R.id.gerizo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.gerizo12);
        gerizo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        gerizo13=findViewById(R.id.gerizo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.gerizo13);
        gerizo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        gerizo14=findViewById(R.id.gerizo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.gerizo14);
        gerizo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        gerizo15=findViewById(R.id.gerizo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.gerizo15);
        gerizo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        gerizo16=findViewById(R.id.gerizo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.gerizo16);
        gerizo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        gerizo17=findViewById(R.id.gerizo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.gerizo17);
        gerizo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        gerizo18=findViewById(R.id.gerizo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.gerizo18);
        gerizo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}