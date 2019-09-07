package com.aptron.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

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

        switch (view.getId()){
            case R.id.bt1:
                SharedPreferences preferences = getSharedPreferences("abhi",MODE_PRIVATE);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("name_key",name);
                editor.putString("pass_key",pass);

                editor.commit();


                break;
            case R.id.bt2:
                intent=new Intent(this,secondAct.class);
                startActivity(intent);
                break;
        }

    }
}
