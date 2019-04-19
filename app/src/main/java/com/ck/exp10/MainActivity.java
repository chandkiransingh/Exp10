package com.ck.exp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx1,tx2,tx3;
    Button button;
    EditText name,age,phone;
    String a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        phone = findViewById(R.id.phone);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        tx3 = findViewById(R.id.tx3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= name.getText().toString();
                b= age.getText().toString();
                c= phone.getText().toString();

                tx1.setText(a);
                tx2.setText(b);
                tx3.setText(c);


            }
        });
    }
}
