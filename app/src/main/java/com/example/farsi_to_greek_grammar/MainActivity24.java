package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity24 extends AppCompatActivity {
    private Button b102,b103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        b102=findViewById(R.id.button102);
        b102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity24.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b103=findViewById(R.id.button103);
        b103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity24.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}