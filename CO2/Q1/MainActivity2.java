package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        Bundle extras=getIntent().getExtras();
        String val= extras.getString("val");
        String val2= extras.getString("val2");
        String val3= extras.getString("val3");
        t1.setText(val);
        t2.setText(val2);
        t3.setText(val3);
    }
}