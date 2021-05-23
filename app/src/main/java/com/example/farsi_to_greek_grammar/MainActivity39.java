package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity39 extends AppCompatActivity {
    private Button b82,b83,dipsao1,dipsao2,dipsao3,dipsao4,dipsao5,dipsao6,dipsao7,dipsao8,dipsao9,
            dipsao10,dipsao11,dipsao12,dipsao13,dipsao14,dipsao15,dipsao16,dipsao17,dipsao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main39);

        b82=findViewById(R.id.button82);
        b82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b83=findViewById(R.id.button83);
        b83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity39.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}