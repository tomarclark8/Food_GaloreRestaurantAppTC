package edu.bpi.myrestaurant;

import android.content.Intent;
import android.net.wifi.aware.SubscribeConfig;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Purchase extends AppCompatActivity {
    private int f1Value;
    private int f2Value;
    private int f3Value;
    private int f4Value;
    private int f5Value;
    private int f6Value;
    private double CP1 = 12.99;
    private double CP2 = 15.50;
    private double BHB = 18.75;
    private double BLT = 9.99;
    private double NYSS = 22.50;
    private double HB = 14.50;
    private double subtotal;
    private double total;

    //Purchase made here
    Button Back;
    Button Confirm;
    Button TotalButton;
    TextView Subtotal;
    TextView Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_purchase);

        Back = (Button) findViewById(R.id.Pback);
        Confirm = (Button) findViewById(R.id.CONFIRM);
        TotalButton = (Button) findViewById(R.id.totalbutton);
        Subtotal = (TextView) findViewById(R.id.subtotal);
        Total = (TextView) findViewById(R.id.total);


        //For Saved data between intents
        Intent getQuantity = getIntent();
        f1Value = getQuantity.getIntExtra("CP1", 0);//cost $12.99
        f2Value = getQuantity.getIntExtra("CP2", 0);//cost $15.50
        f3Value = getQuantity.getIntExtra("BHB", 0);//cost $18.75
        f4Value = getQuantity.getIntExtra("BLT", 0);//cost $9.99
        f5Value = getQuantity.getIntExtra("NYSS", 0);//cost $22.50
        f6Value = getQuantity.getIntExtra("HB", 0);//cost $14.50

        //Back to home
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Purchase.this, Home.class);
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

        //Show subtotal value

        subtotal += (f1Value * CP1);
        subtotal += (f2Value * CP2);
        subtotal += (f3Value * BHB);
        subtotal += (f4Value * BLT);
        subtotal += (f5Value * NYSS);
        subtotal += (f6Value * HB);

        double roundedSubtotal = Math.round(subtotal*100.00)/100.0 ;
        Subtotal.setText("Subtotal: $"+ roundedSubtotal);

        //Show total value
            //Sales tax of %6
        total += (subtotal+(subtotal * (0.06)));
        double roundedTotal = Math.round(total *100.0) / 100.0;
        //The total Button
        TotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                    Total.setText("TOTAL: $" + roundedTotal);

            }
        });

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Purchase.this, Confirmation.class);
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

    }
}