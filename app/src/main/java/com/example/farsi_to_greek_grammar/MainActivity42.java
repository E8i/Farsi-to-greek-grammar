package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity42 extends AppCompatActivity {
    private Button b88,b89;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);

        b88=findViewById(R.id.button88);
        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b89=findViewById(R.id.button89);
        b89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}