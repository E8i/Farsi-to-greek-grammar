package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {
    private Button b64,keleo1,keleo2,keleo3,keleo4,keleo5,keleo6,keleo7,keleo8,keleo9,keleo10,
            keleo11,keleo12,keleo13,keleo14,keleo15,keleo16,keleo17,keleo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        b64=findViewById(R.id.button64);
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity14.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}