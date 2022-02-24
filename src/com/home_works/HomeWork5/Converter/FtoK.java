package com.home_works.HomeWork5.Converter;

public class FtoK extends BaseConverter{
    @Override
    double convert(double gradus) {
        return (gradus + 459.67) / 1.8;
    }
}
