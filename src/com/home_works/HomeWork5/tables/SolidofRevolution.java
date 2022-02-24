package com.home_works.HomeWork5.tables;

public class SolidofRevolution extends Shape{
    private double radius;

    public SolidofRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
