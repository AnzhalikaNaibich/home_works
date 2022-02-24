package com.home_works.HomeWork5.tables;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double mesto;

    public Box(double mesto) {
        super(mesto);
        this.mesto = mesto;
    }

    public boolean add(Shape shape) {
        if (mesto >= shape.getVolume()) {
            shapes.add(shape);
            mesto -= shape.getVolume();
            return true;
        }
        else {
            return false;}
    }
}
