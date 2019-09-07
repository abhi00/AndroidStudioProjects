package com.aptron.fragmentinandroid;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragClick(View view) {
        switch(view.getId()){
            case R.id.b1:
                FragmentManager manager =getSupportFragmentManager();
               FragmentTransaction transaction = manager.beginTransaction();
               FragmentOne one = new FragmentOne();
               transaction.replace(R.id.frag1,one);
               transaction.commit();
               transaction.addToBackStack("");
                break;
            case R.id.b2:
                FragmentManager manager2 =getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                FragmentTwo two = new FragmentTwo();
                transaction2.replace(R.id.frag1,two);
                transaction2.commit();
                transaction2.addToBackStack("");

                break;
            case R.id.b3:
                FragmentManager manager3 =getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                FragmentThree three = new FragmentThree();
                transaction3.replace(R.id.frag1,three);
                transaction3.commit();
                transaction3.addToBackStack("");
                break;
        }
    }
}
