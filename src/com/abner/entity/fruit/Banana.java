package com.abner.entity.fruit;

public class Banana implements Fruit {
    private int price = 70;
    @Override
    public int price() {
        return price;
    }
    public void setPrice(int price){
        this.price =price;
    }

    @Override
    public void draw() {
        System.out.println("香蕉");
    }
}
