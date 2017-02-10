package com.sdacademy.gieysztor.michal.pizzaofflinewroclaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.streetInput);
        String[] streetsArray = getResources().getStringArray(R.array.streets);
        textView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, streetsArray));

    }
}
