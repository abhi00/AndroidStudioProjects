package com.aptron.toast;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastWalaButton(View view) {

        switch (view.getId())
        {
            case R.id.button:
                Toast.makeText(this, "Hello Ji", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:

                Toast toast = new Toast(this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
              LayoutInflater layoutInflater = getLayoutInflater();
             View toastView= layoutInflater.inflate(R.layout.myxml, (ViewGroup) findViewById(R.id.root));
               toast.setView(toastView);
               toast.show();

                break;
            case R.id.button3:

                Snackbar.make(view,"Hello From Aptron",Snackbar.LENGTH_INDEFINITE).setAction("Go Offline", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Thik Hai", Toast.LENGTH_SHORT).show();
                    }
                }).show();

                break;
        }

    }
}
