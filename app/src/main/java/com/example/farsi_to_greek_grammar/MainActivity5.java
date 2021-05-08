package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.chrono.MinguoChronology;

public class MainActivity5 extends AppCompatActivity {
        private Button b22,b23,b24,b25,b26,b27,b28,b29,b30,b51,b98;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b22=findViewById(R.id.button22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity22.class);
                startActivity(in);
            }
        });

        b23=findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent in=new Intent(MainActivity5.this,MainActivity23.class);
                    startActivity(in);
                }
            });
        b24=findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity24.class);
                startActivity(in);
            }
        });
        b25=findViewById(R.id.button25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity25.class);
                startActivity(in);
            }
        });
        b26=findViewById(R.id.button26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity26.class);
                startActivity(in);
            }
        });
        b27=findViewById(R.id.button27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity27.class);
                startActivity(in);
            }
        });
        b28=findViewById(R.id.button28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity28.class);
                startActivity(in);
            }
        });
        b29=findViewById(R.id.button29);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity29.class);
                startActivity(in);
            }
        });
        b30=findViewById(R.id.button30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity30.class);
                startActivity(in);
            }
        });
        b51=findViewById(R.id.button51);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity5.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}