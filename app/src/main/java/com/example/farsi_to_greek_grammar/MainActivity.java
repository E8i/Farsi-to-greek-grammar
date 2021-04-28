package com.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
            private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                b1=findViewById(R.id.button31);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(in);
                    }
                });
        b2=findViewById(R.id.button32);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(in);
            }
        });
        b3=findViewById(R.id.button33);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(in);
            }
        });
        b4=findViewById(R.id.button34);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(in);
            }
        });
        b5=findViewById(R.id.button35);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(in);
            }
        });
        b6=findViewById(R.id.button36);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity7.class);
                startActivity(in);
            }
        });
        b7=findViewById(R.id.button37);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity8.class);
                startActivity(in);
            }
        });
        b8=findViewById(R.id.button38);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity9.class);
                startActivity(in);
            }
        });
        b9=findViewById(R.id.button39);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity10.class);
                startActivity(in);
            }
        });
        b10=findViewById(R.id.button40);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity11.class);
                startActivity(in);
            }
        });
        b11=findViewById(R.id.button41);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity12.class);
                startActivity(in);
            }
        });
        b12=findViewById(R.id.button42);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity13.class);
                startActivity(in);
            }
        });
        b13=findViewById(R.id.button43);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity14.class);
                startActivity(in);
            }
        });
        b14=findViewById(R.id.button44);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity15.class);
                startActivity(in);
            }
        });
        b15=findViewById(R.id.button45);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity16.class);
                startActivity(in);
            }
        });
        b16=findViewById(R.id.button46);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity17.class);
                startActivity(in);
            }
        });
        b17=findViewById(R.id.button47);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity18.class);
                startActivity(in);
            }
        });
        b18=findViewById(R.id.button48);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity19.class);
                startActivity(in);
            }
        });
        b19=findViewById(R.id.button49);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity20.class);
                startActivity(in);
            }
        });
        b20=findViewById(R.id.button50);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,MainActivity21.class);
                startActivity(in);
            }
        });
    }
}