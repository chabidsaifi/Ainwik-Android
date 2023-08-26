package com.abid.spinner_droupdownbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
   Spinner spinner;
   Button btn;
   String places[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        btn = findViewById(R.id.button2);
        places = getResources().getStringArray(R.array.places);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);
        spinner.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Welcome to " +item, Toast.LENGTH_SHORT).show();
            }
        });

    }
}















