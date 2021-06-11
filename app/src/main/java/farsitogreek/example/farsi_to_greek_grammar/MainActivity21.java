package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity21 extends AppCompatActivity {

    private Button b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        b31=findViewById(R.id.button1);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity31.class);
                startActivity(in);
            }
        });
        b32=findViewById(R.id.button2);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity32.class);
                startActivity(in);
            }
        });
        b33=findViewById(R.id.button3);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity33.class);
                startActivity(in);
            }
        });
        b34=findViewById(R.id.button4);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity34.class);
                startActivity(in);
            }
        });
        b35=findViewById(R.id.button5);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity35.class);
                startActivity(in);
            }
        });
        b36=findViewById(R.id.button6);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity36.class);
                startActivity(in);
            }
        });
        b37=findViewById(R.id.button7);
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity37.class);
                startActivity(in);
            }
        });
        b38=findViewById(R.id.button8);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity38.class);
                startActivity(in);
            }
        });
        b39=findViewById(R.id.button9);
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity39.class);
                startActivity(in);
            }
        });
        b40=findViewById(R.id.button10);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity40.class);
                startActivity(in);
            }
        });
        b41=findViewById(R.id.button11);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity41.class);
                startActivity(in);
            }
        });
        b42=findViewById(R.id.button12);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity42.class);
                startActivity(in);
            }
        });
        b43=findViewById(R.id.button13);
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity43.class);
                startActivity(in);
            }
        });
        b44=findViewById(R.id.button14);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity44.class);
                startActivity(in);
            }
        });
        b45=findViewById(R.id.button15);
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity45.class);
                startActivity(in);
            }
        });
        b46=findViewById(R.id.button16);
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity46.class);
                startActivity(in);
            }
        });
        b47=findViewById(R.id.instagramPage);
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity.class);
                startActivity(in);
            }
        });
        b48=findViewById(R.id.facebookpage);
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity48.class);
                startActivity(in);
            }
        });
        b49=findViewById(R.id.button19);
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity49.class);
                startActivity(in);
            }
        });
        b50=findViewById(R.id.button50);
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity21.this,MainActivity50.class);
                startActivity(in);

            }
        });

    }
}