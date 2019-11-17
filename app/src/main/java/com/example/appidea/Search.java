package com.example.appidea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        final Button rm = (Button)findViewById(R.id.room);

        rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchintent = new Intent(Search.this,Room.class);
                startActivity(searchintent);
            }
        });
    }
}
