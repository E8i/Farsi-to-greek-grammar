package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity37 extends AppCompatActivity {
    private Button b78,b79,leo1,leo2,leo3,leo4,leo5,leo6,leo7,leo8,leo9,
            leo10,leo11,leo12,leo13,leo14,leo15,leo16,leo17,leo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main37);

        b78=findViewById(R.id.button78);
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity37.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b79=findViewById(R.id.button79);
        b79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity37.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}