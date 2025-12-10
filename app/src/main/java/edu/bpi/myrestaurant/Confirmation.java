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

import java.util.Random;

public class Confirmation extends AppCompatActivity {
TextView email;
Button Home;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirmation);

        email = (TextView) findViewById(R.id.email);
        Home = (Button) findViewById(R.id.home);


        //For Saved data between intents
        Intent getQuantity = getIntent();
        f1Value = getQuantity.getIntExtra("CP1", 0);//cost $12.99
        f2Value = getQuantity.getIntExtra("CP2", 0);//cost $15.50
        f3Value = getQuantity.getIntExtra("BHB", 0);//cost $18.75
        f4Value = getQuantity.getIntExtra("BLT", 0);//cost $9.99
        f5Value = getQuantity.getIntExtra("NYSS", 0);//cost $22.50
        f6Value = getQuantity.getIntExtra("HB", 0);//cost $14.50

        String randomEmail = generateRandomEmail();
        email.setText(randomEmail);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Confirmation.this, Home.class);
                intent.putExtra("CP1", 0);
                intent.putExtra("CP2", 0);
                intent.putExtra("BHB", 0);
                intent.putExtra("BLT", 0);
                intent.putExtra("NYSS", 0);
                intent.putExtra("HB", 0);
                startActivity(intent);
            }
        });
    }
    private String generateRandomEmail() {
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000; // generates 1000-9999
        return "Order"+ randomNumber + "@gmail.com"+" has been confirmed for order and is being prepared!";
    }
}