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
    Button checkout;
    ImageView oneAdd;
    private int CP1 = 0;
    ImageView twoAdd;
    private int CP2 = 0;
    ImageView threeAdd;
    private int BHB = 0;
    ImageView fourAdd;
    private int BLT = 0;
    ImageView fiveAdd;
    private int NYSS = 0;
    ImageView sixAdd;
    private int HB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);

        checkout = (Button) findViewById(R.id.checkout);
        oneAdd = (ImageView) findViewById(R.id.imageView1);
        twoAdd = (ImageView) findViewById(R.id.imageView2);
        threeAdd = (ImageView) findViewById(R.id.imageView3);
        fourAdd = (ImageView) findViewById(R.id.imageView4);
        fiveAdd = (ImageView) findViewById(R.id.imageView5);
        sixAdd = (ImageView) findViewById(R.id.imageView6);

        //Saves data
        Intent getQuantity = getIntent();
        CP1 = getQuantity.getIntExtra("CP1", 0);
        CP2 = getQuantity.getIntExtra("CP2", 0);
        BHB = getQuantity.getIntExtra("BHB", 0);
        BLT = getQuantity.getIntExtra("BLT", 0);
        NYSS = getQuantity.getIntExtra("NYSS", 0);
        HB = getQuantity.getIntExtra("HB", 0);
        //Food 1
        oneAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CP1++; //Quantity Multiplier
                //ADD CHIME SOUND AS CLICK INDICATOR
            }
        });
        //Food 2
        twoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CP2++; //Quantity Multiplier
            }
        });
        //Food 3
        threeAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                BHB++; //Quantity Multiplier
            }
        });
        //Food 4
        fourAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                BLT++; //Quantity Multiplier
            }
        });
        //Food 5
        fiveAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                NYSS++; //Quantity Multiplier
            }
        });
        //Food 6
        sixAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                HB++; //Quantity Multiplier
            }
        });

        //Checkout
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent orderQuantity = new Intent(Menu.this, OrdersPlaced.class);
                orderQuantity.putExtra("CP1", CP1);
                orderQuantity.putExtra("CP2", CP2);
                orderQuantity.putExtra("BHB", BHB);
                orderQuantity.putExtra("BLT", BLT);
                orderQuantity.putExtra("NYSS", NYSS);
                orderQuantity.putExtra("HB", HB);
                startActivity(orderQuantity);
            }
        });

        //end of interactive
    }

}