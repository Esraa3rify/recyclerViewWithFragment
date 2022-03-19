package com.example.recyclerviewwithfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.myViewHolder> {

    ArrayList<Model>dataHolder;

    public adapter(ArrayList<Model> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewdesign,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

      holder.img.setImageResource(dataHolder.get(position).getImg());
      holder.name.setText(dataHolder.get(position).getName());
      holder.time.setText(dataHolder.get(position).getTime());
      holder.question.setText(dataHolder.get(position).getQuestion());

    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
       ImageView img;
       TextView name, time, question;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

         img=itemView.findViewById(R.id.imageView2);
         name=itemView.findViewById(R.id.name);
         time=itemView.findViewById(R.id. time);
         question=itemView.findViewById(R.id. question);


        }
    }
}
