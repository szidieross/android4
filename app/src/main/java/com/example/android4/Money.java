package com.example.android4;

public class Money {
    private String code;
    private String name;
    private double buyValue;
    private double sendValue;

    public Money(String code, String name, double buyValue, double sendValue) {
        this.code = code;
        this.name = name;
        this.buyValue = buyValue;
        this.sendValue = sendValue;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public double getSendValue() {
        return sendValue;
    }
}
