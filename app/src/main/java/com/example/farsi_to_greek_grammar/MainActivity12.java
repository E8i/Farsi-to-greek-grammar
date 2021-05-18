package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {
    private Button b62,eime1,eime2,eime3,eime4,eime5,eime6,eime7,eime8,eime9,eime10,eime11,
            eime12,eime13,eime14,eime15,eime16,eime17,eime18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        b62=findViewById(R.id.button62);
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity12.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}