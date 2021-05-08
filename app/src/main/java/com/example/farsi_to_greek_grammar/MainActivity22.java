package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity22 extends AppCompatActivity {
    private Button b98,b99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        b98=findViewById(R.id.button98);
        b98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity22.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b99=findViewById(R.id.button99);
        b99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity22.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}