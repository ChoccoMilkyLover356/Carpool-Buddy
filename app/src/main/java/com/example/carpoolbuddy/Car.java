package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Car extends Vehicle{
    int range;
    public Car(int range, String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice){
        super(owner,model,capacity,vehicleID,ridersUIDs,open,vehicleType,basePrice);
        this.range = range;
    }

    public Car(int rangeInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble);
        this.range = range;
    }
}
