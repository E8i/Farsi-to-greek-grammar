package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity16 extends AppCompatActivity {
    private Button b66,pino1,pino2,pino3,pino4,pino5,pino6,pino7,pino8,pino9,pino10,
            pino11,pino12,pino13,pino14,pino15,pino16,pino17,pino18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        b66=findViewById(R.id.button66);
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity16.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}