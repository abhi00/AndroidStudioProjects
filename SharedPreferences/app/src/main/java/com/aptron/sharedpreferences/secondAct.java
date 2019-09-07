package com.aptron.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondAct extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);

    }

    public void back(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.bt3:
                SharedPreferences preferences = getSharedPreferences("abhi",MODE_PRIVATE);
                String name=preferences.getString("name_key","Data Not Found");
                String pass = preferences.getString("pass_key","Data Not Found");
                t1.setText(name);
                t2.setText(pass);
                break;
            case R.id.bt4:
                intent=new Intent(secondAct.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
