package com.aptron.internalstorageinandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondAct extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
    }

    public void back(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.bt3:
                FileInputStream fis= null;
                try {
                    fis = openFileInput("abhi.txt");
                    int read;
                    StringBuffer buffer = new StringBuffer();
                    while ((read=fis.read())!=-1)
                    {
                       buffer.append((char)read);
                    }

                   String name = buffer.substring(0,buffer.indexOf(" "));
                   String pass = buffer.substring(buffer.indexOf(" ")+1);
                   t1.setText(name);
                   t2.setText(pass);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.bt4:
                intent=new Intent(SecondAct.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
