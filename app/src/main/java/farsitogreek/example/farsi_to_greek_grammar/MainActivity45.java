package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity45 extends AppCompatActivity {
    private Button b94,b95,grafo1,grafo2,grafo3,grafo4,grafo5,grafo6,grafo7,grafo8,grafo9,
            grafo10,grafo11,grafo12,grafo13,grafo14,grafo15,grafo16,grafo17,grafo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main45);

        b94=findViewById(R.id.button94);
        b94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity45.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b95=findViewById(R.id.button95);
        b95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity45.this,MainActivity.class);
                startActivity(in);
            }
        });
        grafo1=findViewById(R.id.grafo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.grafo1);
        grafo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        grafo2=findViewById(R.id.grafo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.grafo2);
        grafo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        grafo3=findViewById(R.id.grafo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.grafo3);
        grafo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        grafo4=findViewById(R.id.grafo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.grafo4);
        grafo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        grafo5=findViewById(R.id.grafo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.grafo5);
        grafo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        grafo6=findViewById(R.id.grafo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.grafo6);
        grafo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        grafo7=findViewById(R.id.grafo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.grafo7);
        grafo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        grafo8=findViewById(R.id.grafo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.grafo8);
        grafo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        grafo9=findViewById(R.id.grafo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.grafo9);
        grafo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        grafo10=findViewById(R.id.grafo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.grafo10);
        grafo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        grafo11=findViewById(R.id.grafo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.grafo11);
        grafo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        grafo12=findViewById(R.id.grafo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.grafo12);
        grafo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        grafo13=findViewById(R.id.grafo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.grafo13);
        grafo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        grafo14=findViewById(R.id.grafo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.grafo14);
        grafo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        grafo15=findViewById(R.id.grafo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.grafo15);
        grafo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        grafo16=findViewById(R.id.grafo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.grafo16);
        grafo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        grafo17=findViewById(R.id.grafo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.grafo17);
        grafo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        grafo18=findViewById(R.id.grafo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.grafo18);
        grafo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}