package com.abner.entity.fruit;

public class Apple implements Fruit {
    private int price = 50;
    @Override
    public int price() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public void draw() {
        System.out.println("苹果");
    }
}
