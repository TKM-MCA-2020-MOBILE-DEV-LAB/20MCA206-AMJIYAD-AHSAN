package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String list[]={"nit","amj","abh","arj"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.l1);
        ArrayAdapter<String> my=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        l.setAdapter(my);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name=list[i];
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });
    }
}