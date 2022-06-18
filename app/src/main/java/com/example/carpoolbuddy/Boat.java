package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Boat extends Vehicle{
    int maxSpeed;
    int maxWeight;
    public Boat(){}


    public Boat(int speedInt, int weightInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble, ArrayList<String> ridersUIDs, boolean open, String vehicleType) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble,ridersUIDs,open,vehicleType);
        this.maxWeight = weightInt;
        this.maxSpeed = speedInt;
    }
}
