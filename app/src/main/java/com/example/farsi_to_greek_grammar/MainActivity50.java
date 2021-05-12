package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity50 extends AppCompatActivity {
    private Button b116,b117,b118,b120,b123,b126,b34,b35,b18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main50);

        b116=findViewById(R.id.button116);
        b116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b117=findViewById(R.id.button117);
        b117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity.class);
                startActivity(in);
            }
        });

        b118=findViewById(R.id.button118);
        b118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b120=findViewById(R.id.button120);
        b120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity51.class);
                startActivity(in);

            }
        });

        b123=findViewById(R.id.button123);
        b123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity52.class);
                startActivity(in);
            }
        });

        b126=findViewById(R.id.button126);
        b126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity53.class);
                startActivity(in);
            }
        });

        b34=findViewById(R.id.button34);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity54.class);
                startActivity(in);
            }
        });

        b35=findViewById(R.id.button35);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity55.class);
                startActivity(in);
            }
        });

        b18=findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity56.class);
                startActivity(in);
            }
        });

    }
}