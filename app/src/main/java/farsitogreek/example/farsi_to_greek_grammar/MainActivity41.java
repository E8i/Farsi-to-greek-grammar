package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity41 extends AppCompatActivity {
    private Button b86,b87,xtupao1,xtupao2,xtupao3,xtupao4,xtupao5,xtupao6,xtupao7,xtupao8,xtupao9,
            xtupao10,xtupao11,xtupao12,xtupao13,xtupao14,xtupao15,xtupao16,xtupao17,xtupao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);

        b86=findViewById(R.id.button86);
        b86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity41.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b87=findViewById(R.id.button87);
        b87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity41.this,MainActivity.class);
                startActivity(in);
            }
        });
        xtupao1=findViewById(R.id.xtupao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.xtupao1);
        xtupao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        xtupao2=findViewById(R.id.xtupao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.xtupao2);
        xtupao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        xtupao3=findViewById(R.id.xtupao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.xtupao3);
        xtupao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        xtupao4=findViewById(R.id.xtupao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.xtupao4);
        xtupao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        xtupao5=findViewById(R.id.xtupao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.xtupao5);
        xtupao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        xtupao6=findViewById(R.id.xtupao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.xtupao6);
        xtupao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        xtupao7=findViewById(R.id.xtupao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.xtupao7);
        xtupao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        xtupao8=findViewById(R.id.xtupao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.xtupao8);
        xtupao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        xtupao9=findViewById(R.id.xtupao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.xtupao9);
        xtupao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        xtupao10=findViewById(R.id.xtupao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.xtupao10);
        xtupao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        xtupao11=findViewById(R.id.xtupao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.xtupao11);
        xtupao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        xtupao12=findViewById(R.id.xtupao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.xtupao12);
        xtupao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        xtupao13=findViewById(R.id.xtupao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.xtupao13);
        xtupao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        xtupao14=findViewById(R.id.xtupao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.xtupao14);
        xtupao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        xtupao15=findViewById(R.id.xtupao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.xtupao15);
        xtupao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        xtupao16=findViewById(R.id.xtupao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.xtupao16);
        xtupao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        xtupao17=findViewById(R.id.xtupao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.xtupao17);
        xtupao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        xtupao18=findViewById(R.id.xtupao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.xtupao18);
        xtupao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}