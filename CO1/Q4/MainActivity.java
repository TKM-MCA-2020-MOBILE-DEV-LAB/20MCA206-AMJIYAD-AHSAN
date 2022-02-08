package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    Button b1;
    Pattern patterns;
    Matcher matches;
    String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.Name);
        e2=findViewById(R.id.Address);
        e3=findViewById(R.id.Email);
        e4=findViewById(R.id.Password);
        b1=findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login(){
        if(e1.getText().toString().length()==0){
            e1.requestFocus();
            e1.setError("Enter a valid Name");
        }
        String namePattern="[0-9!@#$%^&*]";
        if(e1.getText().toString().matches(namePattern)){
            e1.requestFocus();
            e1.setError("Enter a valid Name");
            return;
        }
        if(e2.getText().toString().length()==0){
            e2.requestFocus();
            e2.setError("Enter a valid Address");
            return;
        }
        if(!e3.getText().toString().matches(emailPattern)){
            e3.requestFocus();
            e3.setError("Invalid Email");
            return;

        }
        else{
            Toast.makeText(getApplicationContext(),"valid Email Address",Toast.LENGTH_SHORT).show();
        }
        if(e4.getText().toString().length()==0){
            e4.requestFocus();
            e4.setError("password cannot be empty");
            return;
        }
        if(e4.getText().toString().length()<8){
            e4.requestFocus();
            e4.setError("Enter minimum 8 digit password");
            return;
        }
    }
}