package com.home_works.HomeWork5.Converter;

public class KtoF extends BaseConverter{
    @Override
    double convert(double gradus) {
        return (gradus * 1.8 - 459.67);
    }
}
