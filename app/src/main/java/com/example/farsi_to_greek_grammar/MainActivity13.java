package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {
    private Button b63,perno1,perno2,perno3,perno4,perno5,perno6,perno7,perno8,perno9,perno10,
            perno11,perno12,perno13,perno14,perno15,perno16,perno17,perno18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        b63=findViewById(R.id.button63);
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity13.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}