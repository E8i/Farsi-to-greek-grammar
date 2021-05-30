package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity61 extends AppCompatActivity {

    private Button buttonb,buttonk;

    TextView linktextView649;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main61);

        linktextView649 = findViewById(R.id.activity_main_hyperlink);
        linktextView649.setMovementMethod(LinkMovementMethod.getInstance());


        buttonb=findViewById(R.id.buttonb);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity61.this,MainActivity50.class);
                startActivity(in);
            }
        });
        buttonk=findViewById(R.id.buttonk);
        buttonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity61.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}