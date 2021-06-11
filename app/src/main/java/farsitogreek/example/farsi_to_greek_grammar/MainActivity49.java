package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity49 extends AppCompatActivity {
    private Button b111,b112,katalava1,katalava2,katalava3,katalava4,katalava5,katalava6,katalava7,katalava8,katalava9,
            katalava10,katalava11,katalava12,katalava13,katalava14,katalava15,katalava16,katalava17,katalava18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49);

        b111=findViewById(R.id.button111);
        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity49.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b112=findViewById(R.id.button112);
        b112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity49.this,MainActivity.class);
                startActivity(in);
            }
        });
        katalava1=findViewById(R.id.katalava1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.katalava1);
        katalava1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        katalava2=findViewById(R.id.katalava2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.katalava2);
        katalava2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        katalava3=findViewById(R.id.katalava3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.katalava3);
        katalava3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        katalava4=findViewById(R.id.katalava4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.katalava4);
        katalava4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        katalava5=findViewById(R.id.katalava5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.katalava5);
        katalava5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        katalava6=findViewById(R.id.katalava6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.katalava6);
        katalava6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        katalava7=findViewById(R.id.katalava7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.katalava7);
        katalava7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        katalava8=findViewById(R.id.katalava8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.katalava8);
        katalava8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        katalava9=findViewById(R.id.katalava9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.katalava9);
        katalava9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        katalava10=findViewById(R.id.katalava10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.katalava10);
        katalava10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        katalava11=findViewById(R.id.katalava11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.katalava11);
        katalava11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        katalava12=findViewById(R.id.katalava12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.katalava12);
        katalava12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        katalava13=findViewById(R.id.katalava13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.katalava13);
        katalava13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        katalava14=findViewById(R.id.katalava14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.katalava14);
        katalava14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        katalava15=findViewById(R.id.katalava15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.katalava15);
        katalava15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        katalava16=findViewById(R.id.katalava16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.katalava16);
        katalava16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        katalava17=findViewById(R.id.katalava17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.katalava17);
        katalava17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        katalava18=findViewById(R.id.katalava18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.katalava18);
        katalava18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}