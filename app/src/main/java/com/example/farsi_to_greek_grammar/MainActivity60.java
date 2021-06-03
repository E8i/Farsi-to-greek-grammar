package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity60 extends AppCompatActivity {
    private Button tour1,tour2;

    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main60);

        linkTextView = findViewById(R.id.activity_main_hyperlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView778);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView781);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView784);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView787);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView790);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView793);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView796);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.textView799);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        tour1=findViewById(R.id.tour1);
        tour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity60.this,MainActivity50.class);
                startActivity(in);
            }
        });
        tour2=findViewById(R.id.tour2);
        tour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity60.this,MainActivity.class);
                startActivity(in);
            }
        });



    }
}