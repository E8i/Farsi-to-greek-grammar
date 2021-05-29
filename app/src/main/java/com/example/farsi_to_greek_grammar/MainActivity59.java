package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity59 extends AppCompatActivity {
    private Button b139,b140,boro1,boro2,boro3,boro4,boro5,boro6,boro7,boro8,boro9,boro10,boro11,
            boro12,boro13,boro14,boro15,boro16,boro17,boro18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main59);

        b139=findViewById(R.id.button139);
        b139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity59.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b140=findViewById(R.id.button140);
        b140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity59.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}