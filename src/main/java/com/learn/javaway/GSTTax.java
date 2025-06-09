package com.learn.javaway;

public class GSTTax implements Taxation{

    @Override
    public Double calculate(Double amount) {
        return amount * 0.10;
    }
}
