package com.example.reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    String Name;
    String Address;
    String Email;
    String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void click(View view){
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.address);
        e3=findViewById(R.id.email);
        e4=findViewById(R.id.password);
        Name=e1.getText().toString();
        Address=e2.getText().toString();
        Email=e3.getText().toString();
        Password=e4.getText().toString();
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("val1",Name);
        i.putExtra("val2",Address);
        i.putExtra("val3",Email);
        i.putExtra("val4",Password);
        startActivity(i);
        SharedPreferences sh=getSharedPreferences("shared",MODE_PRIVATE);
        SharedPreferences.Editor myEdit= sh.edit();
        myEdit.putString("name",Name);
        myEdit.putString("address",Address);
        myEdit.putString("email",Email);
        myEdit.putString("password",Password);
        myEdit.apply();


    }

    @Override
    protected void onResume() {
        super.onResume();
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.address);
        e3=findViewById(R.id.email);
        e4=findViewById(R.id.password);
        SharedPreferences sh=getSharedPreferences("shared",MODE_PRIVATE);
        e1.setText(sh.getString("name",""));
        e2.setText(sh.getString("address",""));
        e3.setText(sh.getString("email",""));
        e4.setText(sh.getString("password",""));

    }
}