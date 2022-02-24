package com.home_works.HomeWork5.Converter;

public class KtoC extends BaseConverter{
    @Override
    double convert(double gradus) {
        return (gradus - 273.15);
    }
}
