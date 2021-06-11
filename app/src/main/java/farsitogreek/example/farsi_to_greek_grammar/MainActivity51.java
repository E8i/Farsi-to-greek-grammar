package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity51 extends AppCompatActivity {

    private Button conect1,conect2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main51);

        conect1=findViewById(R.id.conect1);
        conect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity51.this,MainActivity50.class);
                startActivity(in);
            }
        });
        conect2=findViewById(R.id.conect2);
        conect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity51.this,MainActivity.class);
                startActivity(in);
            }
        });




    }
}