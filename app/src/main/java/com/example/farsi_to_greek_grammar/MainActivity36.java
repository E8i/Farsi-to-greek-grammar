package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity36 extends AppCompatActivity {
    private Button b76,b77,doulevo1,doulevo2,doulevo3,doulevo4,doulevo5,doulevo6,doulevo7,doulevo8,doulevo9,doulevo10,
            doulevo11,doulevo12,doulevo13,doulevo14,doulevo15,doulevo16,doulevo17,doulevo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main36);

        b76=findViewById(R.id.button76);
        b76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity36.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b77=findViewById(R.id.button77);
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity36.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}