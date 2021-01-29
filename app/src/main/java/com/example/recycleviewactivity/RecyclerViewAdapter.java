package com.example.recycleviewactivity;

import android.content.Context;
import android.icu.util.UniversalTimeScale;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyTViewHolder> {
    private Context context;
    private List<Film> dataList;

    public class MyTViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout backgroundColor;
        ImageView photo;
        TextView name;
        TextView genre;
        TextView minute;
        public MyTViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.film_name);
            genre = view.findViewById(R.id.film_zhanr);
            minute = view.findViewById(R.id.film_minute);
            photo =  view.findViewById(R.id.film_photo);

        }
    }


    public RecyclerViewAdapter(Context context,List<Film> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyTViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item,parent,false);
        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTViewHolder holder, int position) {
        Film item = dataList.get(position);

        Glide.with(context.getApplicationContext()).load(item.getPhoto())
                .placeholder(R.drawable.ic_baseline_live_tv_24)
                .into(holder.photo);
        holder.name.setText(item.getname());
        holder.genre.setText(item.getGenre());
        holder.minute.setText(item.getminute());



    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

}
