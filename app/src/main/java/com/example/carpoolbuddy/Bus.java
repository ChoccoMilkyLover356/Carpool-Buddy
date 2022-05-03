package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Bus extends Vehicle{
int size;
    public Bus(int size, String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice){
        super(owner,model,capacity,vehicleID,ridersUIDs,open,vehicleType,basePrice);
        this.size = size;
    }

    public Bus(int sizeInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble);
        this.size = sizeInt;
    }
}
