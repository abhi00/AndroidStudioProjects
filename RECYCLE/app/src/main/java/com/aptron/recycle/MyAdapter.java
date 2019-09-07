package com.aptron.recycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] title_array,des_array;
    int[] img_array;

    public MyAdapter(Context context, String[] title_array, String[] des_array, int[] img_array) {

        this.context = context;
        this.title_array = title_array;
        this.des_array = des_array;
        this.img_array = img_array;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.myxml,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(title_array[i]);
        myViewHolder.desc.setText(des_array[i]);
        myViewHolder.imageView.setImageResource(img_array[i]);

    }

    @Override
    public int getItemCount() {

        return des_array.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView title,desc;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            desc= itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
