package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity19 extends AppCompatActivity {
    private Button conect4,conect5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        conect4=findViewById(R.id.conect4);
        conect4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity19.this,MainActivity5.class);
                startActivity(in);
            }
        });
        conect5=findViewById(R.id.conect5);
        conect5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity19.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}