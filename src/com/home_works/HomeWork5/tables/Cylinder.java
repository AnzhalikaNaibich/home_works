package com.home_works.HomeWork5.tables;

public class Cylinder extends SolidofRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * height * radius * radius, radius);
        this.height = height;
    }
}
