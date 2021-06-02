package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity60 extends AppCompatActivity {

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



    }
}