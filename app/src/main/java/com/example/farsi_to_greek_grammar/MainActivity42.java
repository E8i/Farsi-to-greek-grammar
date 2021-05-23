package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity42 extends AppCompatActivity {
    private Button b88,b89,poulao1,poulao2,poulao3,poulao4,poulao5,poulao6,poulao7,poulao8,poulao9,
            poulao10,poulao11,poulao12,poulao13,poulao14,poulao15,poulao16,poulao17,poulao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);

        b88=findViewById(R.id.button88);
        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b89=findViewById(R.id.button89);
        b89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity42.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}