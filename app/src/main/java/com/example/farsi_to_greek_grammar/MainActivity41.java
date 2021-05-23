package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity41 extends AppCompatActivity {
    private Button b86,b87,xtupao1,xtupao2,xtupao3,xtupao4,xtupao5,xtupao6,xtupao7,xtupao8,xtupao9,
            xtupao10,xtupao11,xtupao12,xtupao13,xtupao14,xtupao15,xtupao16,xtupao17,xtupao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);

        b86=findViewById(R.id.button86);
        b86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity41.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b87=findViewById(R.id.button87);
        b87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity41.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}