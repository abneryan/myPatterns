package com.abner.creat.factory.factoryMethod;

import com.abner.entity.fruit.Fruit;
import com.abner.entity.fruit.Orange;

public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
