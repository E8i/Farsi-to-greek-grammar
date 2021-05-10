package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity52 extends AppCompatActivity {
    private Button b121,b122;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main52);

        b121=findViewById(R.id.button121);
        b121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity52.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b122=findViewById(R.id.button122);
        b122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity52.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}