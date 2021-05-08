package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity35 extends AppCompatActivity {
    private Button b74,b75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main35);

        b74=findViewById(R.id.button74);
        b74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity35.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b75=findViewById(R.id.button75);
        b75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity35.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}