package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Helicopter extends Vehicle{
    int maxAltitude;
    int maxAirSpeed;
    public Helicopter(){}

    public Helicopter(int altitudeInt, int airSpeedInt, String ownerString, String modelString, int capacity, String vehicleId, double basePriceDouble, ArrayList<String> ridersUIDs, boolean open, String vehicleType) {
        super(ownerString, modelString, capacity, vehicleId, basePriceDouble,ridersUIDs,open,vehicleType);
        this.maxAltitude = altitudeInt;
        this.maxAirSpeed = airSpeedInt;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "maxAltitude=" + maxAltitude +
                ", maxAirSpeed=" + maxAirSpeed +
                '}';
    }
}
