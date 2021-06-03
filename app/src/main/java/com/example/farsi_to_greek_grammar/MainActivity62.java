package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity62 extends AppCompatActivity {

    private Button milao1,milao2,milao3,milao4,milao5,milao6,milao7,milao8,milao9,milao10,
            milao11,milao12,milao13,milao14,milao15,milao16,milao17,milao18,back1,home6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main62);

        back1=findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity62.this,MainActivity50.class);
                startActivity(in);
            }
        });
        home6=findViewById(R.id.home6);
        home6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity62.this,MainActivity.class);
                startActivity(in);
            }
        });




    }
}