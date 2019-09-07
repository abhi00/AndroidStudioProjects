package com.aptron.checkboxinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox lassi,shai,kedhaai,butter,gulaab,daal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lassi = findViewById(R.id.lassi);
        shai= findViewById(R.id.paneer);
        kedhaai= findViewById(R.id.kedhai);
        butter= findViewById(R.id.naan);
        gulaab= findViewById(R.id.jaamun);
        daal= findViewById(R.id.daal);
        gulaab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "moj lo,,,,,", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void order(View view) {

        int amount=0;
        StringBuffer buffer = new StringBuffer();

        if(lassi.isChecked())
        {
          buffer.append("You Selected Lassi: 50rs/=\n");
          amount+=50;
        }
        if(shai.isChecked())
        {
            buffer.append("You Selected Shai Paneer: 250rs/=\n");
            amount+=250;
        }if(kedhaai.isChecked())
        {
            buffer.append("You Selected Lassi: 250rs/=\n");
            amount+=250;
        }if(butter.isChecked())
        {
            buffer.append("You Selected butter Naan: 60rs/=\n");
            amount+=60;
        }if(daal.isChecked())
        {
            buffer.append("You Selected Daal: 150rs/=\n");
            amount+=150;
        }

        buffer.append("Your Total Amount is : "+amount);

        Toast.makeText(this, ""+buffer.toString(), Toast.LENGTH_SHORT).show();

    }
}
