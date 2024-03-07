package com.example.khadijanoor;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class myviewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name1,name2;
    public myviewHolder(@NonNull View itemView) {
        super(itemView);
        image=(ImageView)itemView.findViewById(R.id.image);
        name1=(TextView) itemView.findViewById(R.id.name1);
        name2=(TextView) itemView.findViewById(R.id.name2);
    }
}