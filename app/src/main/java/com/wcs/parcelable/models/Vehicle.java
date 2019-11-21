package com.wcs.parcelable.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    private String brand;
    private String kilometers;

    public Vehicle(String brand, String kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    protected Vehicle(Parcel in) {
        brand = in.readString();
        kilometers = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(brand);
        dest.writeString(kilometers);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }
}
