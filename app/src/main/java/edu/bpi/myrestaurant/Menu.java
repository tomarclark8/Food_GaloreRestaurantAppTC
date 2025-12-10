package edu.bpi.myrestaurant;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    //this is the menu page
    Button Back;
    ImageView oneAdd;
    ImageView twoAdd;
    ImageView threeAdd;
    ImageView fourAdd;
    ImageView fiveAdd;
    ImageView sixAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);

        Back = (Button) findViewById(R.id.mback);
        oneAdd = (ImageView) findViewById(R.id.imageView1);
        twoAdd = (ImageView) findViewById(R.id.imageView2);
        threeAdd = (ImageView) findViewById(R.id.imageView3);
        fourAdd = (ImageView) findViewById(R.id.imageView4);
        fiveAdd = (ImageView) findViewById(R.id.imageView5);
        sixAdd = (ImageView) findViewById(R.id.imageView6);




        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent back = new Intent(Menu.this, Home.class);
                startActivity(back);

            }
        });

        //Intent for food quanity being added
        Intent ordersplaced = new Intent(Menu.this, Menu.class);

        //Food 1
        oneAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ordersplaced.putExtra("CP1", 8);
                startActivity(ordersplaced);

            }
        });
        //Food 2
        twoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ordersplaced.putExtra("CP2", 10);
                startActivity(ordersplaced);


            }
        });
        //Food 3
//        threeAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                ordersplaced.putExtra("BHB", 8);
//                startActivity(ordersplaced);
//
//
//            }
//        });
//        //Food 4
//        fourAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                ordersplaced.putExtra("BLT", 12);
//                startActivity(ordersplaced);
//
//
//            }
//        });
//        //Food 5
//        fiveAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                ordersplaced.putExtra("NYSS", 18);
//                startActivity(ordersplaced);
//
//
//            }
//        });
//        //Food 6
//        sixAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                ordersplaced.putExtra("HB", 20);
//                startActivity(ordersplaced);
//
//
//            }
//        });

    }
}