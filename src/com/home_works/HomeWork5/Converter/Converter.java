package com.home_works.HomeWork5.Converter;

public class Converter {
    public static void main(String[] args) {
        BaseConverter conv = new FtoC();
        System.out.println("F to C = " + conv.convert(20));
        conv = new FtoK();
        System.out.println("F to K = " + conv.convert(20));
        conv = new CtoF();
        System.out.println("C to F = " + conv.convert(50));
        conv = new CtoK();
        System.out.println("C to K = " + conv.convert(45));
        conv = new KtoC();
        System.out.println("K to C = " + conv.convert(100));
        conv = new KtoF();
        System.out.println("K to F = " + conv.convert(91));
    }
}
