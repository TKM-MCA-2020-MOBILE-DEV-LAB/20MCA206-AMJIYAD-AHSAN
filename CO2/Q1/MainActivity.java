package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText first,second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);


    }
    public void click(View view)
    {
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        String name=first.getText().toString();
        String age=second.getText().toString();
        String number=third.getText().toString();
        i.putExtra("val",name);
        i.putExtra("val2",age);
        i.putExtra("val3",number);
        startActivity(i);


    }
    @Override
    protected void onResume() {
        super.onResume();

        // Fetching the stored data
        // from the SharedPreference
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String s1 = sh.getString("name", "");
        String s2 = sh.getString("age", "");
        String s3 = sh.getString("mobile", "");


        // Setting the fetched data
        // in the EditTexts
        first.setText(s1);
        second.setText(s2);
        third.setText(s3);
    }
    @Override
    protected void onPause() {
        super.onPause();

        // Creating a shared pref object
        // with a file name "MySharedPref"
        // in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("name", first.getText().toString());
        myEdit.putString("age", second.getText().toString());
        myEdit.putString("mobile", third.getText().toString());
        myEdit.apply();
    }
}