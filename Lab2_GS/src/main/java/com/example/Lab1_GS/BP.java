package com.example.Lab1_GS;

public class BP {
    protected int PriceOfSell;
    protected int PriceOfBuy;
    protected float course;
    protected String name;
    protected int amount;
    protected boolean key = false;
    public BP(){
        this.amount=0;
        this.course=0;
        this.name="null";
        this.PriceOfBuy=0;
        this.PriceOfSell=0;
    }
    @Override
    public String toString() {
        return ""+name+"{" +
                "PriceOfSell=" + PriceOfSell +
                ", PriceOfBuy=" + PriceOfBuy +
                ", Course=" + course + '}';
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isKey() {
        return key;
    }

    public void setCourse(float course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceOfBuy(int priceOfBuy) {
        PriceOfBuy = priceOfBuy;
    }

    public void setPriceOfSell(int priceOfSell) {
        PriceOfSell = priceOfSell;
    }

    protected int getPriceOfSell() {
        return PriceOfSell;
    }
}
