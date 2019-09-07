package com.aptron.listviewwithmultipleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ls;
    int[] img = {R.drawable.moba,R.drawable.mobb,R.drawable.mobe,R.drawable.mobf,R.drawable.mobg,R.drawable.mobh,R.drawable.mobi,R.drawable.mobj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.list);

        String[] title=getResources().getStringArray(R.array.title);
        String[] des = getResources().getStringArray(R.array.des);

     MyAdapter myAdapter = new MyAdapter(this,title,des,img);
     ls.setAdapter(myAdapter);

    }
}
