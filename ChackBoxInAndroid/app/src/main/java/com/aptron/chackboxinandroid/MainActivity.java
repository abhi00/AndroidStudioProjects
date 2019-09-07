package com.aptron.chackboxinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chBriyani,kabab,nalli,veg,daal,butterChicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chBriyani = findViewById(R.id.chbriy);
        kabab = findViewById(R.id.kababa);
        nalli = findViewById(R.id.nalli);
        veg = findViewById(R.id.veg);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Veg Briyani Bekaar Hai !!", Toast.LENGTH_SHORT).show();
            }
        });
        daal = findViewById(R.id.daal);
        butterChicken= findViewById(R.id.butter);
    }


    public void order(View view) {
        StringBuffer buffer = new StringBuffer();
        int amount =0;
        if(chBriyani.isChecked())
        {
         buffer.append("You Selected Chicken Briyani.: 180/=\n");
         amount +=180;
        }
         if(kabab.isChecked())
         {
             buffer.append("You Selected Tonday Kabab.: 150/=\n");
             amount +=150;
         }
         if(nalli.isChecked())
         {
             buffer.append("You Selected  Nalli Nihari.: 150/=\n");
             amount +=150;

         }
        if(veg.isChecked())
        {
            buffer.append("You Selected  Veg Briyani. : 100/=\n");
            amount +=100;
        }
        if(daal.isChecked())
        {

            buffer.append("You Selected  Daal Makhni. : 100/=\n");
            amount +=100;
        }
        if(butterChicken.isChecked())
        {

            buffer.append("You Selected Butter Chicken. : 360/=\n");
            amount +=360;
        }


        buffer.append("Your Total Bill : "+amount);

        Toast.makeText(this, ""+buffer.toString(), Toast.LENGTH_LONG).show();

    }
}
