package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
    }
    public void onSubmit(View view)
    {

        SharedPreferences sh=getSharedPreferences("stored",MODE_PRIVATE);
        SharedPreferences.Editor e=sh.edit();
        e.putString("val1",e1.getText().toString());
        e.putString("val2",e2.getText().toString());
        e.commit();
        Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {

        super.onResume();
        SharedPreferences sh=getSharedPreferences("stored",MODE_PRIVATE);
        e1.setText(sh.getString("val1",""));

    }
}