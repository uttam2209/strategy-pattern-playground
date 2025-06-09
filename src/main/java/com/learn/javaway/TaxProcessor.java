package com.learn.javaway;

public class TaxProcessor {
    private final Taxation taxation;

    public TaxProcessor(Taxation taxation) {
        this.taxation = taxation;
    }

    public Double processor(Double amount){
        return taxation.calculate(amount);
    }
}
