package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity56 extends AppCompatActivity {
    private Button b133,b134;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main56);

        b133=findViewById(R.id.button133);
        b133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity56.this,MainActivity50.class);
                startActivity(in);
            }
        });

        b134=findViewById(R.id.button134);
        b134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity56.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}