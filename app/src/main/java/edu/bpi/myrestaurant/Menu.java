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
    Button minus1;
    Button minus2;
    Button minus3;
    Button minus4;
    Button minus5;
    Button minus6;
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

        minus1 = (Button) findViewById(R.id.minus1);
        minus2 = (Button) findViewById(R.id.minus2);
        minus3 = (Button) findViewById(R.id.minus3);
        minus4 = (Button) findViewById(R.id.minus4);
        minus5 = (Button) findViewById(R.id.minus5);
        minus6 = (Button) findViewById(R.id.minus6);
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
        //Add #1 to Food 1
        oneAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CP1++; //Quantity Multiplier
                //ADD CHIME SOUND AS CLICK INDICATOR
            }
        });
        //Subtract #1 to Food 1
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CP1 <= 0){
                    CP1 = 0;
                } else {
                    CP1--;
                }
            }
        });
        //Add #1 to Food 2
        twoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CP2++; //Quantity Multiplier
            }
        });
        //Subtract #1 to Food 2
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CP2 <= 0){
                    CP2 = 0;
                } else {
                    CP2--;
                }
            }
        });
        //Add #1 to Food 3
        threeAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                BHB++; //Quantity Multiplier
            }
        });
        //Subtract #1 to Food 3
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BHB <= 0){
                    BHB = 0;
                } else {
                    BHB--;
                }
            }
        });
        //Add #1 to Food 4
        fourAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                BLT++; //Quantity Multiplier
            }
        });
        //Subtract #1 to Food 4
        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BLT <= 0){
                    BLT = 0;
                } else {
                    BLT--;
                }
            }
        });
        //Add #1 to Food 5
        fiveAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                NYSS++; //Quantity Multiplier
            }
        });
        //Subtract #1 to Food 5
        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NYSS <= 0){
                    NYSS = 0;
                } else {
                    NYSS--;
                }


            }
        });
        //Add #1 to Food 6
        sixAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                HB++; //Quantity Multiplier
            }
        });
        //Subtract #1 to Food 6
        minus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(HB <= 0){
                    HB = 0;
                } else {
                    HB--;
                }

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