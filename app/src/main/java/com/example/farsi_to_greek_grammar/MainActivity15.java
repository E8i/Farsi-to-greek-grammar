package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity15 extends AppCompatActivity {
    private Button b65,ertha1,ertha2,ertha3,ertha4,ertha5,ertha6,ertha7,ertha8,ertha9,ertha10,
            ertha11,ertha12,ertha13,ertha14,ertha15,ertha16,ertha17,ertha18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        b65=findViewById(R.id.button65);
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity15.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}