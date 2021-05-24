package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity38 extends AppCompatActivity {
    private Button b80,b81,fonazo1,fonazo2,fonazo3,fonazo4,fonazo5,fonazo6,fonazo7,fonazo8,fonazo9,fonazo11,
            fonazo12,fonazo13,fonazo14,fonazo15,fonazo16,fonazo17,fonazo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main38);

        b80=findViewById(R.id.button80);
        b80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity38.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b81=findViewById(R.id.button81);
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity38.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}