package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity43 extends AppCompatActivity {
    private Button b90,b91,fovoume1,fovoume2,fovoume3,fovoume4,fovoume5,fovoume6,fovoume7,fovoume8,fovoume9,
            fovoume10,fovoume11,fovoume12,fovoume13,fovoume14,fovoume15,fovoume16,fovoume17,fovoume18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main43);

        b90=findViewById(R.id.button90);
        b90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity43.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b91=findViewById(R.id.button91);
        b91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity43.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}