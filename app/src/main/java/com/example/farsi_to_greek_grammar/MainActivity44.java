package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity44 extends AppCompatActivity {
    private Button b92,b93;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main44);

        b92=findViewById(R.id.button92);
        b92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity44.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b93=findViewById(R.id.button93);
        b93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity44.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}