package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity48 extends AppCompatActivity {
    private Button b109,b110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main48);

        b109=findViewById(R.id.button109);
        b109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity48.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b110=findViewById(R.id.button110);
        b110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity48.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}