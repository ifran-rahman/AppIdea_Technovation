package com.example.appidea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.search_button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent searchintent = new Intent(MainActivity.this,Search.class);
                startActivity(searchintent);

            }
        });

    }
}
