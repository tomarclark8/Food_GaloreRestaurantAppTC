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
    Button reserve;
    Button menu;
    Button Address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        reserve = (Button) findViewById(R.id.Reserve);
        menu = (Button) findViewById(R.id.Menu);
        Address = (Button) findViewById(R.id.Address);

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=1400+W+Cold+Spring+Ln,+Baltimore,+Maryland"); // z param is zoom level
                Address.setText("Address: 1400W Cold Spring Ln");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Menu.class);
                startActivity(intent);

            }
        });

        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Reservation.class);
                startActivity(intent);

            }
        });
    }
}