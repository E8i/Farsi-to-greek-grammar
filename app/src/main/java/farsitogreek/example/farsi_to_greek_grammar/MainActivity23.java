package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity23 extends AppCompatActivity {
    private Button b100,b101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);


        b100=findViewById(R.id.button100);
        b100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity23.this,MainActivity5.class);
                startActivity(in);
            }
        });

        b101=findViewById(R.id.button101);
        b101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity23.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}