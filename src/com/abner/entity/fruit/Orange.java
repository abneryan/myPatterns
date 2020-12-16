package com.abner.entity.fruit;

public class Orange implements Fruit {
    private int price = 80;

    @Override
    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void draw() {
        System.out.println("橘子");
    }
}
