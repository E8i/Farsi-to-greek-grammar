package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity25 extends AppCompatActivity {
    private Button b113,b114;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        b113=findViewById(R.id.button113);
        b113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity25.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b114=findViewById(R.id.button114);
        b114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity25.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}