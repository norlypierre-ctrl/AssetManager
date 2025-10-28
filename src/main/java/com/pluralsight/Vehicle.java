package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
}
