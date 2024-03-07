package com.example.khadijanoor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class Details extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    ImageView img;
    Model model;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv1 = findViewById(R.id.name1);
        img = findViewById(R.id.image);
        tv2 = findViewById(R.id.name2);

        model = new Gson().fromJson(getIntent().getStringExtra("data"), Model.class);

        tv1.setText(model.getHeaderTitle());
        img.setImageResource(model.getImagreName());

        // Display the description if available, otherwise hide the TextView
        if (model.getDescription() != null && !model.getDescription().isEmpty()) {
            tv2.setText(model.getDescription());
            tv2.setVisibility(View.VISIBLE);
        } else {
            tv2.setVisibility(View.GONE);
        }
    }
}
