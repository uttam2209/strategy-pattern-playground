package com.learn.javaway;

public class VATTax implements Taxation{

    @Override
    public Double calculate(Double amount) {
        return amount * 0.05;
    }
}
