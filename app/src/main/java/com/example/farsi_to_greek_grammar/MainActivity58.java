package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity58 extends AppCompatActivity {
    private Button b137,b138;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main58);

        b137=findViewById(R.id.button137);
        b137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity58.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b138=findViewById(R.id.button138);
        b138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity58.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}