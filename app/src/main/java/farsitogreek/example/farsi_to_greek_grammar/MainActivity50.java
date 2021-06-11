package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity50 extends AppCompatActivity {
    private Button b116,b117,b118,b123,b126,b34,b35,b18,b20,b17,b21,b31,button120,button36,button37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main50);

        b116=findViewById(R.id.button116);
        b116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity21.class);
                startActivity(in);
            }
        });

        b117=findViewById(R.id.button117);
        b117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity.class);
                startActivity(in);
            }
        });

        b118=findViewById(R.id.button118);
        b118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity51.class);
                startActivity(in);
            }
        });

        b123=findViewById(R.id.button123);
        b123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity52.class);
                startActivity(in);
            }
        });

        b126=findViewById(R.id.button126);
        b126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity53.class);
                startActivity(in);
            }
        });

        b34=findViewById(R.id.button34);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b35=findViewById(R.id.button35);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity55.class);
                startActivity(in);
            }
        });

        b18=findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity56.class);
                startActivity(in);
            }
        });

        b20=findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity54.class);
                startActivity(in);
            }
        });

        b17=findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity57.class);
                startActivity(in);
            }
        });

        b21=findViewById(R.id.button21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity58.class);
                startActivity(in);
            }
        });

        b31=findViewById(R.id.button31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity59.class);
                startActivity(in);
            }
        });
        button120=findViewById(R.id.button120);
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity61.class);
                startActivity(in);
            }
        });
        button36=findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity60.class);
                startActivity(in);
            }
        });
        button37=findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity50.this,MainActivity62.class);
                startActivity(in);
            }
        });

    }
}