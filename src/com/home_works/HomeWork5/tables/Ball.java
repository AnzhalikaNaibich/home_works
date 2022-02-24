package com.home_works.HomeWork5.tables;

public class Ball extends SolidofRevolution{

    public Ball(double radius) {
        super(4/3 * Math.PI * Math.pow(radius, 3), radius);
    }
}
