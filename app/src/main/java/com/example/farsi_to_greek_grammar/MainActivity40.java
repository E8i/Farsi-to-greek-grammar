package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity40 extends AppCompatActivity {
    private Button b84,b85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main40);

        b84=findViewById(R.id.button84);
        b84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity40.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b85=findViewById(R.id.button85);
        b85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity40.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}