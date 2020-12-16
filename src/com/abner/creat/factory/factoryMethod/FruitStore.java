package com.abner.creat.factory.factoryMethod;

import com.abner.entity.bag.Bag;
import com.abner.entity.fruit.Fruit;

public class FruitStore {
    public static void main(String[] args) {
        pack();
    }
    public static void pack(){
        AppleFactory appleFactory = new AppleFactory();
        Fruit fruit = appleFactory.getFruit();
        fruit.draw();

        AppleBagFactory appleBagFactory = new AppleBagFactory();
        Bag bag = appleBagFactory.getBag();
        bag.pack();
    }
}
