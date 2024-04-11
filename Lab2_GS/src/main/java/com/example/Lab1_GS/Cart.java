package com.example.Lab1_GS;

import java.util.ArrayList;

public class Cart {
    private boolean empty = true;
    private ArrayList<Product> p = new ArrayList<Product>();
    public  Cart(){
        /*Product zero = new Figure();
        this.p.add(zero);*/
    }
    public void setCart(Product start){
        this.p.add(start);
    }
    public void Show(){
        if(!empty) {
            for (int i = 1; i < p.size(); i++) {
                System.out.println(p.get(i));
            }
        }
        else{
            System.out.println("Empty");
        }
    }
    public void Tootal(){
        int ttl = 0;
        if(!empty) {
            for (int i = 1; i < p.size(); i++) {
                if(p.get(i) instanceof BP) {
                    BP tmp = (BP) p.get(i);
                    ttl += tmp.getPriceOfSell();
                }
            }
        }
        System.out.println("Total of the cart: "+ttl);
    }
    public void add(Product A){
        p.add(A);
        empty=false;
    }
}
