package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity55 extends AppCompatActivity {
    private Button b130,b131;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main55);

        b130=findViewById(R.id.button130);
        b130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity55.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b131=findViewById(R.id.button131);
        b131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity55.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}