package com.aptron.listviewwithmultipleimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter {

    Context context;
    String[] title_array;
    String[] des_array;
    int[] img_array;

    public MyAdapter( Context context, String[] title_array,String[] des_array,int[] img_array) {
        super(context, R.layout.myxml,R.id.title,title_array);

        this.context =context;
        this.title_array= title_array;
        this.des_array=des_array;
        this.img_array=img_array;

    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

       LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View row=inflater.inflate(R.layout.myxml,parent,false);

      TextView title_text =row.findViewById(R.id.title);

        TextView des_text =row.findViewById(R.id.des);


        ImageView image_view =row.findViewById(R.id.image);


         title_text.setText(title_array[position]);
         des_text.setText(des_array[position]);
         image_view.setImageResource(img_array[position]);

         return row;
    }
}
