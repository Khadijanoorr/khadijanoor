package com.example.khadijanoor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myviewHolder> {

    ArrayList<Model> data;
    Context context;

    public myAdapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        final Model temp = data.get(position);
        holder.name1.setText(data.get(position).getHeaderTitle());
        holder.image.setImageResource(data.get(position).getImagreName());

        holder.post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Details.class);
                intent.putExtra("data", new Gson().toJson(temp));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
