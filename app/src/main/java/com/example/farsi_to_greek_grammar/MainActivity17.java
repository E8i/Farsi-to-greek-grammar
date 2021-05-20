package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity17 extends AppCompatActivity {
    private Button b67,trexo1,trexo2,trexo3,trexo4,trexo5,trexo6,trexo7,trexo8,trexo9,
            trexo11,trexo12,trexo13,trexo14,trexo15,trexo17,trexo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        b67=findViewById(R.id.button67);
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity17.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}