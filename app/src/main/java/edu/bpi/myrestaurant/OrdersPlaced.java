package edu.bpi.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrdersPlaced extends AppCompatActivity {
    TextView f1;
    TextView f2;
    TextView f3;
    TextView f4;
    TextView f5;
    TextView f6;

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



        Intent getOrders = new Intent();
        getOrders.getIntExtra("CP1", 1);
        getOrders.getIntExtra("CP2", 1);
        getOrders.getIntExtra("BHB", 1);
        getOrders.getIntExtra("BLT", 1);
        getOrders.getIntExtra("NYSS", 1);
        getOrders.getIntExtra("HB", 1);




    }
}