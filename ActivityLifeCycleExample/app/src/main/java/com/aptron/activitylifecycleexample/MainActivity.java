package com.aptron.activitylifecycleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate  (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("abhi","OnCreate Executed!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("abhi","OnStart Executed!!!");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("abhi","OnResume Executed!!!");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("abhi","OnPause Executed!!!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("abhi","OnStop Executed!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("abhi","OnRestart Executed!!!");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("abhi","OnDestroy Executed!!!");

    }

    public void next(View view) {
        startActivity(new Intent(this,Home.class));
    }
}
