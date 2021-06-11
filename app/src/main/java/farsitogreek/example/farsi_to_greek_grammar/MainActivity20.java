package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity20 extends AppCompatActivity {

    private Button helth1,helth2,helth3,helth4,helth5,helth6,helth7,helth8,helth9,helth10,helth11,
            helth12,helth13,helth14,helth15,helth16,helth17,helth18,helth19,helth20,helth21,helth22,
            helth23,helth24,helth25,helth26,helth27,helth28,helth29,helth30,helth31,helth32,helth33,
            helth34,helth35,helth36,helth37,helth38,helth39,helth44,toup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        helth44=findViewById(R.id.helth44);
        helth44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity20.this,MainActivity.class);
                startActivity(in);
            }
        });
        toup=findViewById(R.id.toup);
        toup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity20.this,MainActivity20.class);
                startActivity(in);
            }
        });

        helth1=findViewById(R.id.helth1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.helth1);
        helth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });

        helth2=findViewById(R.id.helth2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.helth2);
        helth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        helth3=findViewById(R.id.helth3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.helth3);
        helth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        helth4=findViewById(R.id.helth4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.helth4);
        helth4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        helth5=findViewById(R.id.helth5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.helth5);
        helth5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        helth6=findViewById(R.id.helth6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.helth6);
        helth6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        helth7=findViewById(R.id.helth7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.helth7);
        helth7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        helth8=findViewById(R.id.helth8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.helth8);
        helth8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        helth9=findViewById(R.id.helth9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.helth9);
        helth9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        helth10=findViewById(R.id.helth10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.helth10);
        helth10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        helth11=findViewById(R.id.helth11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.helth11);
        helth11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        helth12=findViewById(R.id.helth12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.helth12);
        helth12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

        helth13=findViewById(R.id.helth13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.helth13);
        helth13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });

        helth14=findViewById(R.id.helth14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.helth14);
        helth14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });

        helth15=findViewById(R.id.helth15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.helth15);
        helth15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });

        helth16=findViewById(R.id.helth16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.helth16);
        helth16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });

        helth17=findViewById(R.id.helth17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.helth17);
        helth17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });

        helth18=findViewById(R.id.helth18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.helth18);
        helth18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

        helth19=findViewById(R.id.helth19);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.helth19);
        helth19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });

        helth20=findViewById(R.id.helth20);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.helth20);
        helth20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });

        helth21=findViewById(R.id.helth21);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.helth21);
        helth21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });

        helth22=findViewById(R.id.helth22);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.helth22);
        helth22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });

        helth23=findViewById(R.id.helth23);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.helth23);
        helth23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });

        helth24=findViewById(R.id.helth24);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.helth24);
        helth24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });

        helth25=findViewById(R.id.helth25);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this,R.raw.helth25);
        helth25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });

        helth26=findViewById(R.id.helth26);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this,R.raw.helth26);
        helth26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });

        helth27=findViewById(R.id.helth27);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this,R.raw.helth27);
        helth27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });

        helth28=findViewById(R.id.helth28);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this,R.raw.helth28);
        helth28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });

        helth29=findViewById(R.id.helth29);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this,R.raw.helth29);
        helth29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });

        helth30=findViewById(R.id.helth30);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this,R.raw.helth30);
        helth30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });

        helth31=findViewById(R.id.helth31);
        final MediaPlayer mediaPlayer31 = MediaPlayer.create(this,R.raw.helth31);
        helth31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
            }
        });

        helth32=findViewById(R.id.helth32);
        final MediaPlayer mediaPlayer32 = MediaPlayer.create(this,R.raw.helth32);
        helth32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
            }
        });

        helth33=findViewById(R.id.helth33);
        final MediaPlayer mediaPlayer33 = MediaPlayer.create(this,R.raw.helth33);
        helth33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
            }
        });

        helth34=findViewById(R.id.helth34);
        final MediaPlayer mediaPlayer34 = MediaPlayer.create(this,R.raw.helth34);
        helth34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
            }
        });

        helth35=findViewById(R.id.helth35);
        final MediaPlayer mediaPlayer35 = MediaPlayer.create(this,R.raw.helth35);
        helth35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
            }
        });

        helth36=findViewById(R.id.helth36);
        final MediaPlayer mediaPlayer36 = MediaPlayer.create(this,R.raw.helth36);
        helth36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
            }
        });

        helth37=findViewById(R.id.helth37);
        final MediaPlayer mediaPlayer37 = MediaPlayer.create(this,R.raw.helth37);
        helth37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer37.start();
            }
        });

        helth38=findViewById(R.id.helth38);
        final MediaPlayer mediaPlayer38 = MediaPlayer.create(this,R.raw.helth38);
        helth38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer38.start();
            }
        });

        helth39=findViewById(R.id.helth39);
        final MediaPlayer mediaPlayer39 = MediaPlayer.create(this,R.raw.helth39);
        helth39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer39.start();
            }
        });


    }
}