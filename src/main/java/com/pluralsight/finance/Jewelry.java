package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double value) {
        super(name, value);
        this.karat = value;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
