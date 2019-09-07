package com.aptron.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("abhi","OnCreate2 is Executed");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("abhi","OnStart2 is Executed");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("abhi","OnResume2 is Executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("abhi","OnPause2 is Executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("abhi","OnStop2 is Executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("abhi","OnRestart2 is Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("abhi","OnDestroy2 is Executed");
    }

    public void back(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
