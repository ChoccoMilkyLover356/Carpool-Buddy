package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Boat extends Vehicle{
    int maxSpeed;
    int maxWeight;
    public Boat(int maxSpeed, int maxWeight, String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice){
        super(owner,model,capacity,vehicleID,ridersUIDs,open,vehicleType,basePrice);
        this.maxWeight = maxWeight;
        this.maxSpeed = maxSpeed;
    }

    public Boat(int speedInt, int weightInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble);
        this.maxWeight = weightInt;
        this.maxSpeed = speedInt;
    }
}
