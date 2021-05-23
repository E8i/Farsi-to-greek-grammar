package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity33 extends AppCompatActivity {
    private Button b70,b71,forao1,forao2,forao3,forao4,forao5,forao6,forao7,forao8,forao9,
            forao10,forao12,forao13,forao14,forao15,forao16,forao17,forao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);

        b70=findViewById(R.id.button70);
        b70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity33.this,MainActivity21.class);
                startActivity(in);
            }
        });
        b71=findViewById(R.id.button71);
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity33.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}