package com.example.listviewimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        ArrayList<String> name=new ArrayList<>();
        name.add("NAME");
        name.add("ADDRESS");
        name.add("new");
        name.add("now");
        name.add("NAME");
        name.add("ADDRESS");
        name.add("new");
        name.add("now");
        name.add("NAME");
        name.add("ADDRESS");
        name.add("new");
        name.add("now");
        name.add("NAME");
        name.add("NAME");
        name.add("ADDRESS");
        name.add("new");
        name.add("now");
        name.add("ADDRESS");
        name.add("new");
        name.add("now");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
///new implementation

    }
}