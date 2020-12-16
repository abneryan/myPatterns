package com.abner.creat.factory.simple;

import com.abner.entity.fruit.Fruit;

public class StaticFactoryTest {
    public static void main(String[] args) {
        eatFruit();
        eatFruit1();
    }

    public static void eatFruit(){
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        fruit.draw();
    }
    public static void eatFruit1(){
        Fruit banana = StaticFactory.getFriotBanana();
        banana.draw();
    }
}