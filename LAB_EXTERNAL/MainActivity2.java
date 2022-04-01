package com.example.reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a=findViewById(R.id.t1);
        b=findViewById(R.id.t2);
        c=findViewById(R.id.t3);
        d=findViewById(R.id.t4);
        Intent i=getIntent();
        Bundle extras=getIntent().getExtras();
        String name2=extras.getString("val1");
        String address2=extras.getString("val2");
        String email2=extras.getString("val3");
        String password2=extras.getString("val4");
        a.setText(name2);
        b.setText(address2);
        c.setText(email2);
        d.setText(password2);


    }
}