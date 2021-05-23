package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity46 extends AppCompatActivity {
    private Button b96,b97,dino1,dino2,dino3,dino4,dino5,dino6,dino7,dino8,dino9,dino10,
            dino11,dino12,dino13,dino14,dino15,dino16,dino17,dino18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main46);

        b96=findViewById(R.id.button96);
        b96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity46.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b97=findViewById(R.id.button97);
        b97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity46.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}