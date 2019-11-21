package com.wcs.parcelable.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.wcs.parcelable.R;
import com.wcs.parcelable.models.Vehicle;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("vehicle");

        TextView textBrand = findViewById(R.id.textBrand);
        textBrand.setText(vehicle.getBrand());
        TextView textKilometers = findViewById(R.id.textKilometers);
        textKilometers.setText(vehicle.getKilometers());
    }
}
