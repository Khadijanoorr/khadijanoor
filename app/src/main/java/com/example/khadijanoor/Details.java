package com.example.khadijanoor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView tv1,tv2;
    ImageView img;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        img=(ImageView) findViewById(R.id.imagedes);
        tv1=(TextView) findViewById(R.id.name);
        tv2=(TextView) findViewById(R.id.namedes2);
        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("description"));
    }
}