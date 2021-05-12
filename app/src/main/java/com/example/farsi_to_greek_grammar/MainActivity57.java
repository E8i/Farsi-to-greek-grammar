package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity57 extends AppCompatActivity {
    private Button b136,b135;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main57);

        b135=findViewById(R.id.button135);
        b135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity57.this,MainActivity.class);
                startActivity(in);
            }
        });

        b136=findViewById(R.id.button136);
        b136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity57.this,MainActivity50.class);
                startActivity(in);
            }
        });
    }
}