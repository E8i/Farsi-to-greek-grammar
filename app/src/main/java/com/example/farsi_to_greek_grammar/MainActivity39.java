package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity39 extends AppCompatActivity {
    private Button b82,b83;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main39);

        b82=findViewById(R.id.button82);
        b82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b83=findViewById(R.id.button83);
        b83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}