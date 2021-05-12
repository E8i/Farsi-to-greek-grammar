package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity53 extends AppCompatActivity {
    private Button b124,b125;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main53);

        b124=findViewById(R.id.button124);
        b124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity53.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b125=findViewById(R.id.button125);
        b125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity53.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}