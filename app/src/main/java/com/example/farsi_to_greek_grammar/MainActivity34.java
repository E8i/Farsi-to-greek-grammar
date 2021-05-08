package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity34 extends AppCompatActivity {
    private Button b72,b73;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);

        b72=findViewById(R.id.button72);
        b72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity34.this,MainActivity21.class);
                startActivity(in);
            }
        });
        b73=findViewById(R.id.button73);
        b73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity34.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}