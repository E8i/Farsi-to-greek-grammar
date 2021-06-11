package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity4 extends AppCompatActivity {
    private Button b55,troo1,troo2,troo3,troo4,troo5,troo6,troo7,troo8,troo9,troo10,troo11,troo12,troo13,
            troo14,troo15,troo16,troo17,troo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b55=findViewById(R.id.button55);
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity4.this,MainActivity.class);
                startActivity(in);
            }
        });
        troo1=findViewById(R.id.troo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.troo1);
        troo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        troo2=findViewById(R.id.troo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.troo2);
        troo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        troo3=findViewById(R.id.troo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.troo3);
        troo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        troo4=findViewById(R.id.troo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.troo4);
        troo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        troo5=findViewById(R.id.troo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.troo5);
        troo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        troo6=findViewById(R.id.troo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.troo6);
        troo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        troo7=findViewById(R.id.troo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.troo7);
        troo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        troo8=findViewById(R.id.troo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.troo8);
        troo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        troo9=findViewById(R.id.troo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.troo9);
        troo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        troo10=findViewById(R.id.troo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.troo10);
        troo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        troo11=findViewById(R.id.troo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.troo11);
        troo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        troo12=findViewById(R.id.troo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.troo12);
        troo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        troo13=findViewById(R.id.troo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.troo13);
        troo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        troo14=findViewById(R.id.troo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.troo14);
        troo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        troo15=findViewById(R.id.troo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.troo15);
        troo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        troo16=findViewById(R.id.troo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.troo16);
        troo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        troo17=findViewById(R.id.troo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.troo17);
        troo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        troo18=findViewById(R.id.troo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.troo18);
        troo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
    }
}