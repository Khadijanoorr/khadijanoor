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
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
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
        ob1.setHeaderTitle("Caramel Filled");
        ob1.setDescription("Fresh caramel cream sauce with a little pinch of salt");
        ob1.setImagreName(R.drawable.caramelfilled);
        holder.add(ob1);
        Model ob2= new Model();
        ob2.setHeaderTitle("Chocolate Filled");
        ob2.setDescription("Chocolate sauce prepared with dark chocolate");
        ob2.setImagreName(R.drawable.chocolatefilled);
        holder.add(ob2);
        Model ob3= new Model();
        ob3.setHeaderTitle("Chocolate Glazed");
        ob3.setDescription("Chocolate glaze made with butter and cocoa");
        ob3.setImagreName(R.drawable.chocolatefilled);
        holder.add(ob3);
        Model ob4= new Model();
        ob4.setHeaderTitle("Mini Filled Chocolate");
        ob4.setDescription("Chocolate filled donuts with different toppings");
        ob4.setImagreName(R.drawable.mixchocolatefilled);
        holder.add(ob4);
        Model ob5= new Model();
        ob5.setHeaderTitle("Chocolate Hazelnut");
        ob5.setDescription("Chocolate glazed donut topped with  crushed hazelnuts");
        ob5.setImagreName(R.drawable.donut1);
        holder.add(ob5);
        Model ob6= new Model();
        ob6.setHeaderTitle("Cute Mini Hearts");
        ob6.setDescription("Chocolate glazed heart donuts topped with mini hearts and white chocolate");
        ob6.setImagreName(R.drawable.minihearts);
        holder.add(ob6);
        Model ob7= new Model();
        ob7.setHeaderTitle("Mini Glazed");
        ob7.setDescription("Chocolate Glazed donuts with different toppings");
        ob7.setImagreName(R.drawable.mixx);
        holder.add(ob7);
        Model ob8= new Model();
        ob8.setHeaderTitle("Nutella Filled");
        ob8.setDescription("Filled with pure nutella ");
        ob8.setImagreName(R.drawable.donut2);
        holder.add(ob8);
        Model ob9= new Model();
        ob9.setHeaderTitle("Chocolate Oreo");
        ob9.setDescription("Chocolate glazed donut topped with  crushed oreos");
        ob9.setImagreName(R.drawable.oreo);
        holder.add(ob9);
        Model ob10= new Model();
        ob10.setHeaderTitle("Plain Glazed Suagr");
        ob10.setDescription("Plain glazed donuts coated with sugar");
        ob10.setImagreName(R.drawable.plainglazed);
        holder.add(ob10);

        return holder;
    }
}