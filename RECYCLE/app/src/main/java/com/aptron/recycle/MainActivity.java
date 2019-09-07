package com.aptron.recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] title,desc;
    int[] img = {R.drawable.moba,R.drawable.mobb,R.drawable.mobe,R.drawable.mobf,R.drawable.mobg,R.drawable.mobh,R.drawable.mobi,R.drawable.mobj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recy);
        title = getResources().getStringArray(R.array.title);
        desc =getResources().getStringArray(R.array.des);

        MyAdapter myAdapter = new MyAdapter(this,title,desc,img);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
