package com.aptron.internalstorageinandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
    }

    public void show(View view) {
        Intent intent;

        String name = et1.getText().toString();
        String pass = et2.getText().toString();

        name = name+" ";

        switch (view.getId()){
            case R.id.bt1:
                FileOutputStream stream= null;
                try {
                   stream = openFileOutput("abhi.txt",MODE_PRIVATE);
                    stream.write(name.getBytes());
                    stream.write(pass.getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {

                    try {
                        stream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


                break;
            case R.id.bt2:
                intent=new Intent(this,SecondAct.class);
                startActivity(intent);
                break;
        }

    }
}
