package com.example.calc;

import
        androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    TextView output;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        text1=findViewById(R.id.t1);
        text2= findViewById(R.id.t2);
        output=findViewById(R.id.out);
        int val=Integer.parseInt(text1.getText().toString());
        int val1=Integer.parseInt(text2.getText().toString());
        output.setText("Result="+Integer.toString(val+val1));

    }
    public void sub(View view){
        text1=findViewById(R.id.t1);
        text2= findViewById(R.id.t2);
        output=findViewById(R.id.out);
        int val=Integer.parseInt(text1.getText().toString());
        int val1=Integer.parseInt(text2.getText().toString());
        output.setText("Result="+Integer.toString(val-val1));

    }
    public void mul(View view){
        text1=findViewById(R.id.t1);
        text2= findViewById(R.id.t2);
        output=findViewById(R.id.out);
        int val=Integer.parseInt(text1.getText().toString());
        int val1=Integer.parseInt(text2.getText().toString());
        output.setText("Result="+Integer.toString(val*val1));

    }
    public void div(View view){
        text1=findViewById(R.id.t1);
        text2= findViewById(R.id.t2);
        output=findViewById(R.id.out);
        int val=Integer.parseInt(text1.getText().toString());
        int val1=Integer.parseInt(text2.getText().toString());
        output.setText("Result="+Integer.toString(val/val1));

    }
}