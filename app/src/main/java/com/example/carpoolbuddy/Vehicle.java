package com.example.carpoolbuddy;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements Serializable {
    protected String owner;
    protected String model;
    protected int capacity;
    protected String vehicleID;
    protected ArrayList<String> ridersUIDs;
    protected boolean open;
    protected String vehicleType;
    protected double basePrice;

    public Vehicle(){}

    public Vehicle(String ownerString, String modelString, int capacityInt, String vehicleId, double basePriceDouble, ArrayList<String> ridersUIDs, boolean open, String vehicleType) {
        this.owner = ownerString;
        this.model = modelString;
        this.capacity = capacityInt;
        this.vehicleID = vehicleId;
        this.vehicleType = vehicleType;
        this.ridersUIDs = ridersUIDs;
        this.open = open;
        this.basePrice = basePriceDouble;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", vehicleID='" + vehicleID + '\'' +
                ", ridersUIDs=" + ridersUIDs +
                ", open=" + open +
                ", vehicleType='" + vehicleType + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public ArrayList<String> getRidersUIDs() {
        return ridersUIDs;
    }

    public void setRidersUIDs(ArrayList<String> ridersUIDs) {
        this.ridersUIDs = ridersUIDs;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
