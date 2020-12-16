package com.abner.creat.factory.abstractFactory;

import com.abner.entity.bag.Bag;
import com.abner.entity.fruit.Fruit;

public class OrderSendTest {
    public static void main(String[] args) {
        orderSend();
    }

    private static void orderSend() {
        BananaFactory bananaFactory = new BananaFactory();
        Fruit fruit = bananaFactory.getFruit();
        fruit.draw();

        Bag bag = bananaFactory.getBag();
        bag.pack();
    }
}
