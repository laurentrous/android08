package com.wcs.parcelable.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wcs.parcelable.R;
import com.wcs.parcelable.models.Vehicle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSend = findViewById(R.id.btnGo);
        btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView brand = findViewById(R.id.brand);
                TextView kilometers = findViewById(R.id.kilometers);
                Vehicle vehicle = new Vehicle(brand.getText().toString(), kilometers.getText().toString());

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("vehicle", vehicle);
                startActivity(intent);

            }
        });
    }
}
