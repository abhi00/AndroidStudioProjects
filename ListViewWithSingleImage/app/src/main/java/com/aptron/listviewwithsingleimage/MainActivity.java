package com.aptron.listviewwithsingleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ls;
    String[] data = {"Abhishek","Ravi","Kavi","Navi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.myxml,R.id.textView,data);
        ls.setAdapter(adapter);

    }
}
