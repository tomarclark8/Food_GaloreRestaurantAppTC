package edu.bpi.myrestaurant;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrdersPlaced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orders_placed);

        Intent getOrders = new Intent();
        getOrders.getIntExtra("CP1", 1);
        getOrders.getIntExtra("CP2", 1);
        getOrders.getIntExtra("BHB", 1);
        getOrders.getIntExtra("BLT", 1);
        getOrders.getIntExtra("NYSS", 1);
        getOrders.getIntExtra("HB", 1);




    }
}