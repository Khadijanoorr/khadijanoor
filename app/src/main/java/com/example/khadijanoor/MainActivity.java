package com.example.khadijanoor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Khadija Diaries");

        rcv = (RecyclerView) findViewById(R.id.rclview);
      //  rcv.setLayoutManager(new LinearLayoutManager(this));
     myAdapter adapter=new myAdapter(dataqueue(),getApplicationContext());
     rcv.setAdapter(adapter);
     //LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//rcv.setLayoutManager(layoutManager);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }
    public ArrayList<Model> dataqueue()
    {

        ArrayList<Model> holder=new ArrayList<>();
        Model ob1= new Model();
        ob1.setHeaderTitle("Chocolate Hazelnut");
        ob1.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob1.setImagreName(R.drawable.donut1);
        holder.add(ob1);
        Model ob2= new Model();
        ob2.setHeaderTitle("Chocolate Hazelnut");
        ob2.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob2.setImagreName(R.drawable.donut1);
        holder.add(ob2);
        Model ob3= new Model();
        ob3.setHeaderTitle("Chocolate Hazelnut");
        ob3.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob3.setImagreName(R.drawable.donut1);
        holder.add(ob3);
        Model ob4= new Model();
        ob4.setHeaderTitle("Chocolate Hazelnut");
        ob4.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob4.setImagreName(R.drawable.donut1);
        holder.add(ob4);
        Model ob5= new Model();
        ob5.setHeaderTitle("Chocolate Hazelnut");
        ob5.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob5.setImagreName(R.drawable.donut1);
        holder.add(ob5);
        Model ob6= new Model();
        ob6.setHeaderTitle("Chocolate Hazelnut");
        ob6.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob6.setImagreName(R.drawable.donut1);
        holder.add(ob6);
        Model ob7= new Model();
        ob7.setHeaderTitle("Chocolate Hazelnut");
        ob7.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob7.setImagreName(R.drawable.donut1);
        holder.add(ob7);
        Model ob8= new Model();
        ob8.setHeaderTitle("Chocolate Hazelnut");
        ob8.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob8.setImagreName(R.drawable.donut1);
        holder.add(ob8);
        Model ob9= new Model();
        ob9.setHeaderTitle("Chocolate Hazelnut");
        ob9.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob9.setImagreName(R.drawable.donut1);
        holder.add(ob9);
        Model ob10= new Model();
        ob10.setHeaderTitle("Chocolate Hazelnut");
        ob10.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob10.setImagreName(R.drawable.donut1);
        holder.add(ob10);

        return holder;
    }
}