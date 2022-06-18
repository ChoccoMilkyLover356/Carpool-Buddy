package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Bus extends Vehicle{
int size;
    public Bus(){}

    public Bus(int sizeInt, String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble, ArrayList<String> ridersUIDs, boolean open, String vehicleType) {
        super(ownerString, modelString, capacityInt, vehicleId, basePriceDouble,ridersUIDs,open,vehicleType);
        this.size = sizeInt;
    }
}
