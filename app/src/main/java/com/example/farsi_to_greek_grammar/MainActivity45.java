package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity45 extends AppCompatActivity {
    private Button b94,b95;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main45);

        b94=findViewById(R.id.button94);
        b94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity45.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b95=findViewById(R.id.button95);
        b95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity45.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}