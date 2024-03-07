package com.example.khadijanoor;


import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class myviewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name1;
    RelativeLayout post;
    public myviewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        name1=itemView.findViewById(R.id.name1);
        post=itemView.findViewById(R.id.post);
    }
}