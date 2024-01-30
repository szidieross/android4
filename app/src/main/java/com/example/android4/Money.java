package com.example.android4;

public class Money {
    private String code;
    private String name;
    private double buyValue;
    private double sendValue;
    private int imageResourceId;

    public Money(String code, String name, double buyValue, double sendValue, int imageResourceId) {
        this.code = code;
        this.name = name;
        this.buyValue = buyValue;
        this.sendValue = sendValue;
        this.imageResourceId = imageResourceId;
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

    public int getImageResourceId() {
        return imageResourceId;
    }
}
