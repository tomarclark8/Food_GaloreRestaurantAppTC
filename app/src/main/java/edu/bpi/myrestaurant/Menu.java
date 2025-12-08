package edu.bpi.myrestaurant;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    //this is the menu page
    Button Back;
    Button oneAdd;
    Button twoAdd;
    Button threeAdd;
    Button fourAdd;
    Button fiveAdd;
    Button sixAdd;

    Intent orders = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);

        Back = (Button) findViewById(R.id.mback);
        oneAdd = (Button) findViewById(R.id.add1);
        twoAdd = (Button) findViewById(R.id.add2);
        threeAdd = (Button) findViewById(R.id.add3);
        fourAdd = (Button) findViewById(R.id.add4);
        fiveAdd = (Button) findViewById(R.id.add5);
        sixAdd = (Button) findViewById(R.id.add6);


        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent back = new Intent(Menu.this, Home.class);
                startActivity(back);

            }
        });
        //Food 1
        oneAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });
        //Food 2
        twoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });
        //Food 3
        threeAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });
        //Food 4
        fourAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });
        //Food 5
        fiveAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });
        //Food 6
        sixAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                orders = new Intent(Menu.this, OrdersPlaced.class);
                startActivity(orders);

            }
        });

    }
}