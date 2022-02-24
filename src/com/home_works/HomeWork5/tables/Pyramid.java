package com.home_works.HomeWork5.tables;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(1/3 * s * h);
        this.s = s;
        this.h = h;
    }
}
