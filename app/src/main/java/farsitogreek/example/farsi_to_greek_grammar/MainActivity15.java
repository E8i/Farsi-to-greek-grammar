package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity15 extends AppCompatActivity {
    private Button b65,ertha1,ertha2,ertha3,ertha4,ertha5,ertha6,ertha7,ertha8,ertha9,ertha10,
            ertha11,ertha12,ertha13,ertha14,ertha15,ertha16,ertha17,ertha18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        b65=findViewById(R.id.button65);
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity15.this,MainActivity.class);
                startActivity(in);
            }
        });
        ertha1=findViewById(R.id.ertha1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.ertha1);
        ertha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        ertha2=findViewById(R.id.ertha2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.ertha2);
        ertha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        ertha3=findViewById(R.id.ertha3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.ertha3);
        ertha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        ertha4=findViewById(R.id.ertha4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.ertha4);
        ertha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        ertha5=findViewById(R.id.ertha5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.ertha5);
        ertha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        ertha6=findViewById(R.id.ertha6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.ertha6);
        ertha6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        ertha7=findViewById(R.id.ertha7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.ertha7);
        ertha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        ertha8=findViewById(R.id.ertha8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.ertha8);
        ertha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        ertha9=findViewById(R.id.ertha9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.ertha9);
        ertha9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        ertha10=findViewById(R.id.ertha10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.ertha10);
        ertha10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        ertha11=findViewById(R.id.ertha11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.ertha11);
        ertha11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        ertha12=findViewById(R.id.ertha12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.ertha12);
        ertha12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        ertha13=findViewById(R.id.ertha13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.ertha13);
        ertha13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        ertha14=findViewById(R.id.ertha14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.ertha14);
        ertha14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        ertha15=findViewById(R.id.ertha15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.ertha15);
        ertha15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        ertha16=findViewById(R.id.ertha16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.ertha16);
        ertha16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        ertha17=findViewById(R.id.ertha17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.ertha17);
        ertha17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        ertha18=findViewById(R.id.ertha18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.ertha18);
        ertha18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });



    }
}