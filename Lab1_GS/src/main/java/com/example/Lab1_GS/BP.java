package com.example.Lab1_GS;

public class BP {
    protected int PriceOfSell;
    protected int PriceOfBuy;
    protected float course;
    protected String name;
    protected int amount;

    @Override
    public String toString() {
        return ""+name+"{" +
                "PriceOfSell=" + PriceOfSell +
                ", PriceOfBuy=" + PriceOfBuy +
                ", Course=" + course + '}';
    }
}
