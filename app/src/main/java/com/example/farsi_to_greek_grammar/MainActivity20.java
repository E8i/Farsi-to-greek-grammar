package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity20 extends AppCompatActivity {

    private Button helth1,helth2,helth3,helth4,helth5,helth6,helth7,helth8,helth9,helth10,helth11,
            helth12,helth13,helth14,v15,helth16,helth17,helth18,helth19,helth20,helth21,helth22,
            helth23,helth24,helth25,helth26,helth27,helth28,helth29,helth30,helth31,helth32,helth33,helth34,
            helth35,helth36,helth37,helth38,helth39,helth40,helth41,helth42,helth43,helth44;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        helth44=findViewById(R.id.helth44);
        helth44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity20.this,MainActivity.class);
                startActivity(in);
            }
        });


    }
}