package com.example.carpoolbuddy;

import java.util.ArrayList;

public class Vehicle {
    private String owner;
    private String model;
    private int capacity;
    private String vehicleID;
    private ArrayList<String> ridersUIDs;
    private boolean open;
    private String vehicleType;
    double basePrice;

    public Vehicle(String owner, String model, int capacity, String vehicleID, ArrayList<String> ridersUIDs, boolean open, String vehicleType, double basePrice){
        this.owner = owner;
        this.model = model;
        this.capacity = capacity;
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.ridersUIDs = ridersUIDs;
        this.open = open;
        this.basePrice = basePrice;

    }

    public Vehicle(String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble) {

    }
}
