package com.abner.creat.factory.factoryMethod;

import com.abner.entity.fruit.Apple;
import com.abner.entity.fruit.Fruit;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
