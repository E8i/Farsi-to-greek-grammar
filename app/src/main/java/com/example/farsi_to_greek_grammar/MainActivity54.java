package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity54 extends AppCompatActivity {
    private Button b127,b128;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main54);

        b127=findViewById(R.id.button127);
        b127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity54.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b128=findViewById(R.id.button178);
        b128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity54.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}