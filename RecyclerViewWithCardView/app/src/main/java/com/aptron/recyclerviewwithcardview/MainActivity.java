package com.aptron.recyclerviewwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    int[] img = {R.drawable.moba,R.drawable.mobb,R.drawable.mobe,R.drawable.mobf,R.drawable.mobg,R.drawable.mobh,R.drawable.mobi,R.drawable.mobj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recy);
    String[] title = getResources().getStringArray(R.array.title);
    recyclerView.setAdapter(new MyAdapter(this,img,title));
   // recyclerView.setLayoutManager(new LinearLayoutManager(this));
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayout.HORIZONTAL,true));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
