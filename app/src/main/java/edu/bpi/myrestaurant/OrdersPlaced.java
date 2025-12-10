package edu.bpi.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    Button Back;
    Button Purchase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orders_placed);

        Back = (Button) findViewById(R.id.opback);
        Purchase = (Button) findViewById(R.id.purchase);
        f1 = (TextView) findViewById(R.id.f1);
        f2 = (TextView) findViewById(R.id.f2);
        f3 = (TextView) findViewById(R.id.f3);
        f4 = (TextView) findViewById(R.id.f4);
        f5 = (TextView) findViewById(R.id.f5);
        f6 = (TextView) findViewById(R.id.f6);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(OrdersPlaced.this, Menu.class);
                //putExtra for saved data between intents
                intent.putExtra("CP1", f1Value);
                intent.putExtra("CP2", f2Value);
                intent.putExtra("BHB", f3Value);
                intent.putExtra("BLT", f4Value);
                intent.putExtra("NYSS", f5Value);
                intent.putExtra("HB", f6Value);
                startActivity(intent);

            }
        });

        Purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(OrdersPlaced.this, Purchase.class);
                //putExtra for saved data between intents
                intent.putExtra("CP1", f1Value);
                intent.putExtra("CP2", f2Value);
                intent.putExtra("BHB", f3Value);
                intent.putExtra("BLT", f4Value);
                intent.putExtra("NYSS", f5Value);
                intent.putExtra("HB", f6Value);
                startActivity(intent);

            }
        });

        Intent getQuantity = getIntent();
        f1Value = getQuantity.getIntExtra("CP1", 0);//cost $12.99
        f2Value = getQuantity.getIntExtra("CP2", 0);//cost $15.50
        f3Value = getQuantity.getIntExtra("BHB", 0);//cost $18.75
        f4Value = getQuantity.getIntExtra("BLT", 0);//cost $9.99
        f5Value = getQuantity.getIntExtra("NYSS", 0);//cost $22.50
        f6Value = getQuantity.getIntExtra("HB", 0);//cost $14.50

        //Sets Quantity of food
        f1.setText("CP1: "+f1Value+"x");
        f2.setText("CP2: "+f2Value+"x");
        f3.setText("BHB: "+f3Value+"x");
        f4.setText("BLT: "+f4Value+"x");
        f5.setText("NYSS: "+f5Value+"x");
        f6.setText("HB: "+f6Value+"x");

    }
}