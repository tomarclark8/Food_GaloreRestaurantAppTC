package edu.bpi.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    //Purchase made here
    Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_purchase);

        Back = (Button) findViewById(R.id.Pback);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Purchase.this, Home.class);
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