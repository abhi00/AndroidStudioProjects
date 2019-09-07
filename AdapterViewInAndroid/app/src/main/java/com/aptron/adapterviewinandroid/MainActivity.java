package com.aptron.adapterviewinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] city ={"Delhi","Mumbai","Gurugram","Noida","Nagpur","Dholakpur"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter  = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,city);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);


    }
}
