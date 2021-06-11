package farsitogreek.example.farsi_to_greek_grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.farsi_to_greek_grammar.R;

public class MainActivity29 extends AppCompatActivity {

    private Button book1,book2;

    TextView textView826;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);

        textView826 = findViewById(R.id.textView826);
        textView826.setMovementMethod(LinkMovementMethod.getInstance());

        book1=findViewById(R.id.book1);
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity29.this,MainActivity5.class);
                startActivity(in);
            }
        });
        book2=findViewById(R.id.book2);
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity29.this,MainActivity.class);
                startActivity(in);
            }
        });




    }
}