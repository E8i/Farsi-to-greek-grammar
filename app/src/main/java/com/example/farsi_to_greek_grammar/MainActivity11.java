package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {
    private Button b61,pao1,pao2,pao3,pao4,pao5,pao6,pao7,pao8,pao9,pao10,
            pao11,pao12,pao13,pao14,pao15,pao16,pao17,pao18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        b61=findViewById(R.id.button61);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity11.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}