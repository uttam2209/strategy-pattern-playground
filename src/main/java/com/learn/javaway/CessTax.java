package com.learn.javaway;

public class CessTax implements Taxation{

    @Override
    public Double calculate(Double amount) {
        return amount * 0.20;
    }
}
