package com.home_works.HomeWork5.Converter;

public class FtoC extends BaseConverter{
    @Override
    double convert(double gradus) {
        return (gradus - 32) / 1.8;
    }
}
