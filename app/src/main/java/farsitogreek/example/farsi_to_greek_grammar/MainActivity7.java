package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity7 extends AppCompatActivity {
    private Button b57,vlepo1,vlepo2,vlepo3,vlepo4,vlepo5,vlepo6,vlepo7,vlepo8,vlepo9,vlepo10,
            vlepo11,vlepo12,vlepo13,vlepo14,vlepo15,vlepo16,vlepo17,vlepo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        b57=findViewById(R.id.button57);
        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity7.this,MainActivity.class);
                startActivity(in);
            }
        });
        vlepo1=findViewById(R.id.vlepo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.vlepo1);
        vlepo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        vlepo2=findViewById(R.id.vlepo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.vlepo2);
        vlepo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        vlepo3=findViewById(R.id.vlepo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.vlepo3);
        vlepo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        vlepo4=findViewById(R.id.vlepo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.vlepo4);
        vlepo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        vlepo5=findViewById(R.id.vlepo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.vlepo5);
        vlepo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        vlepo6=findViewById(R.id.vlepo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.vlepo6);
        vlepo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        vlepo7=findViewById(R.id.vlepo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.vlepo7);
        vlepo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        vlepo8=findViewById(R.id.vlepo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.vlepo8);
        vlepo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        vlepo9=findViewById(R.id.vlepo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.vlepo9);
        vlepo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        vlepo10=findViewById(R.id.vlepo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.vlepo10);
        vlepo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        vlepo11=findViewById(R.id.vlepo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.vlepo11);
        vlepo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        vlepo12=findViewById(R.id.vlepo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.vlepo12);
        vlepo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        vlepo13=findViewById(R.id.vlepo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.vlepo13);
        vlepo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        vlepo14=findViewById(R.id.vlepo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.vlepo14);
        vlepo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        vlepo15=findViewById(R.id.vlepo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.vlepo15);
        vlepo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        vlepo16=findViewById(R.id.vlepo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.vlepo16);
        vlepo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        vlepo17=findViewById(R.id.vlepo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.vlepo17);
        vlepo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        vlepo18=findViewById(R.id.vlepo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.vlepo18);
        vlepo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}