package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity49 extends AppCompatActivity {
    private Button b111,b112,katalava1,katalava2,katalava3,katalava4,katalava5,katalava6,katalava7,katalava8,katalava9,
            katalava10,katalava11,katalava12,katalava13,katalava14,katalava15,katalava16,katalava17,katalava18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49);

        b111=findViewById(R.id.button111);
        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity49.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b112=findViewById(R.id.button112);
        b112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity49.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}