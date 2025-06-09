package com.learn.javaway;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        TaxProcessor taxProcessor = new TaxProcessor(new GSTTax());
        log.info("GST tax: {}", taxProcessor.processor(202.5));
    }
}
