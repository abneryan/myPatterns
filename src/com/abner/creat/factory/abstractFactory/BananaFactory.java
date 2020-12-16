package com.abner.creat.factory.abstractFactory;

import com.abner.entity.bag.Bag;
import com.abner.entity.bag.BananaBag;
import com.abner.entity.fruit.Banana;
import com.abner.entity.fruit.Fruit;

public class BananaFactory implements AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
