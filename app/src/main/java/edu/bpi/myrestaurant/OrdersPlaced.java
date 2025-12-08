package edu.bpi.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrdersPlaced extends AppCompatActivity {
    TextView f1;
    private int f1Value;
    TextView f2;
    private int f2Value;
    TextView f3;
    private int f3Value;
    TextView f4;
    private int f4Value;
    TextView f5;
    private int f5Value;
    TextView f6;
    private int f6Value;



    Intent getOrders = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orders_placed);

        f1 = (TextView) findViewById(R.id.f1);
        f2 = (TextView) findViewById(R.id.f2);
        f3 = (TextView) findViewById(R.id.f3);
        f4 = (TextView) findViewById(R.id.f4);
        f5 = (TextView) findViewById(R.id.f5);
        f6 = (TextView) findViewById(R.id.f6);

        f1Value = getOrders.getIntExtra("CP1", 1);
        f2Value = getOrders.getIntExtra("CP2", 1);
        f3Value = getOrders.getIntExtra("BHB", 1);
        f4Value = getOrders.getIntExtra("BLT", 1);
        f5Value = getOrders.getIntExtra("NYSS", 1);
        f6Value = getOrders.getIntExtra("HB", 1);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                 f1.setText("CP1: "+f1Value+"x");
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                f1.setText("CP2: "+f2Value+"x");
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                f1.setText("BHB: "+f3Value+"x");
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                f1.setText("BLT: "+f4Value+"x");
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                f1.setText("NYSS: "+f5Value+"x");
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Sets Quantity of food
                f1.setText("HB: "+f6Value+"x");
            }
        });


    }
}