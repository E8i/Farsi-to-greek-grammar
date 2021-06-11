package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity13 extends AppCompatActivity {
    private Button b63,perno1,perno2,perno3,perno4,perno5,perno6,perno7,perno8,perno9,perno10,
            perno11,perno12,perno13,perno14,perno15,perno16,perno17,perno18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        b63=findViewById(R.id.button63);
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity13.this,MainActivity.class);
                startActivity(in);
            }
        });
        perno1=findViewById(R.id.perno1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.perno1);
        perno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        perno2=findViewById(R.id.perno2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.perno2);
        perno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        perno3=findViewById(R.id.perno3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.perno3);
        perno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        perno4=findViewById(R.id.perno4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.perno4);
        perno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        perno5=findViewById(R.id.perno5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.perno5);
        perno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        perno6=findViewById(R.id.perno6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.perno6);
        perno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        perno7=findViewById(R.id.perno7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.perno7);
        perno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        perno8=findViewById(R.id.perno8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.perno8);
        perno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        perno9=findViewById(R.id.perno9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.perno9);
        perno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        perno10=findViewById(R.id.perno10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.perno10);
        perno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        perno11=findViewById(R.id.perno11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.perno11);
        perno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        perno12=findViewById(R.id.perno12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.perno12);
        perno12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        perno13=findViewById(R.id.perno13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.perno13);
        perno13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        perno14=findViewById(R.id.perno14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.perno14);
        perno14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        perno15=findViewById(R.id.perno15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.perno15);
        perno15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        perno16=findViewById(R.id.perno16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.perno16);
        perno16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        perno17=findViewById(R.id.perno17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.perno17);
        perno17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        perno18=findViewById(R.id.perno18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.perno18);
        perno18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}