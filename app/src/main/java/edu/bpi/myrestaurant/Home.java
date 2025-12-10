package edu.bpi.myrestaurant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    //tThis is the home page
    Button orders;
    Button menu;
    Button Address;

    private int f1Value;
    private int f2Value;
    private int f3Value;
    private int f4Value;
    private int f5Value;
    private int f6Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        orders = (Button) findViewById(R.id.OrdersPlaced);
        menu = (Button) findViewById(R.id.Menu);
        Address = (Button) findViewById(R.id.Address);

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=1400+W+Cold+Spring+Ln,+Baltimore,+Maryland"); // z param is zoom level
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Menu.class);
                intent.putExtra("CP1", f1Value);
                intent.putExtra("CP2", f2Value);
                intent.putExtra("BHB", f3Value);
                intent.putExtra("BLT", f4Value);
                intent.putExtra("NYSS", f5Value);
                intent.putExtra("HB", f6Value);
                startActivity(intent);


            }
        });
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, OrdersPlaced.class);
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

        f1Value = getQuantity.getIntExtra("CP1", 0);
        f2Value = getQuantity.getIntExtra("CP2", 0);
        f3Value = getQuantity.getIntExtra("BHB", 0);
        f4Value = getQuantity.getIntExtra("BLT", 0);
        f5Value = getQuantity.getIntExtra("NYSS", 0);
        f6Value = getQuantity.getIntExtra("HB", 0);
    }
}