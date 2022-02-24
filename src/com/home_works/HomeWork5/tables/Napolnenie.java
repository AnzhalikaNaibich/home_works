package com.home_works.HomeWork5.tables;

public class Napolnenie {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(8, 9);
        Cylinder cylinder = new Cylinder(14, 3);
        Ball ball = new Ball(11);

        Box box = new Box(115.8);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}
