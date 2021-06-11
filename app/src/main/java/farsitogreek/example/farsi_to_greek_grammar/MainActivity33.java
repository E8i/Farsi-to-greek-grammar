package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity33 extends AppCompatActivity {
    private Button b70,b71,forao1,forao2,forao3,forao4,forao5,forao6,forao7,forao8,forao9,
            forao10,forao11,forao12,forao13,forao14,forao15,forao16,forao17,forao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);

        b70=findViewById(R.id.button70);
        b70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity33.this,MainActivity21.class);
                startActivity(in);
            }
        });
        b71=findViewById(R.id.button71);
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity33.this,MainActivity.class);
                startActivity(in);
            }
        });
        forao1=findViewById(R.id.forao1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.forao1);
        forao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        forao2=findViewById(R.id.forao2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.forao2);
        forao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        forao3=findViewById(R.id.forao3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.forao3);
        forao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        forao4=findViewById(R.id.forao4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.forao4);
        forao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        forao5=findViewById(R.id.forao5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.forao5);
        forao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        forao6=findViewById(R.id.forao6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.forao6);
        forao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        forao7=findViewById(R.id.forao7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.forao7);
        forao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        forao8=findViewById(R.id.forao8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.forao8);
        forao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        forao9=findViewById(R.id.forao9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.forao9);
        forao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        forao10=findViewById(R.id.forao10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.forao10);
        forao10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        forao11=findViewById(R.id.forao11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.forao11);
        forao11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        forao12=findViewById(R.id.forao12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.forao12);
        forao12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        forao13=findViewById(R.id.forao13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.forao13);
        forao13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        forao14=findViewById(R.id.forao14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.forao14);
        forao14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        forao15=findViewById(R.id.forao15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.forao15);
        forao15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        forao16=findViewById(R.id.forao16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.forao16);
        forao16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        forao17=findViewById(R.id.forao17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.forao17);
        forao17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        forao18=findViewById(R.id.forao18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.forao18);
        forao18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}