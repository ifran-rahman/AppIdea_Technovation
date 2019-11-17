package com.example.appidea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Room extends AppCompatActivity {

    private ListView listView ;


    private PropertyAdapter mPropertyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        listView = (ListView)findViewById(R.id.list);

        List <Property> properties = new ArrayList<>();

        properties.add(new Property("5000","bashundhara"));
        properties.add(new Property("2500","mirpur"));

        mPropertyAdapter= new PropertyAdapter(this,properties);
        listView.setAdapter(mPropertyAdapter);
    }
}
