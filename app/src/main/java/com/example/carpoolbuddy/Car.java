package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Car extends Vehicle{
    int range;

    public Car(){}

    public Car(int rangeInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble, ArrayList<String> ridersUIDs, boolean open, String vehicleType) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble, ridersUIDs, open, vehicleType);
        this.range = rangeInt;
    }

    @Override
    public String toString() {
        return "Car{" +
                "range=" + range + "Owner=" + owner + "model=" + model + "capacity=" + capacity
                + "vehicleId=" + vehicleID + "basePrice=" + basePrice + "ridersUIDs=" + ridersUIDs
                + "open=" + open + "vehicleType=" + vehicleType +
                '}';
    }
}
