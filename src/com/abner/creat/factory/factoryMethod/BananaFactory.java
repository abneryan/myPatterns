package com.abner.creat.factory.factoryMethod;

import com.abner.entity.fruit.Banana;
import com.abner.entity.fruit.Fruit;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
