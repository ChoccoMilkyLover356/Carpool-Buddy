package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Helicopter extends Vehicle{
    int maxAltitude;
    int maxAirSpeed;

    public Helicopter(int maxAltitude, int maxAirSpeed, String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice){
        super(owner,model,capacity,vehicleID,ridersUIDs,open,vehicleType,basePrice);
        this.maxAltitude = maxAltitude;
        this.maxAirSpeed = maxAirSpeed;
    }

    public Helicopter(int altitudeInt, int airSpeedInt, String ownerString, String modelString, int capacity, String vehicleId, double basePriceDouble) {
        super(ownerString, modelString, capacity, vehicleId, basePriceDouble);
        this.maxAltitude = altitudeInt;
        this.maxAirSpeed = airSpeedInt;
    }
}
