package com.abner.creat.factory.abstractFactory;

import com.abner.entity.bag.Bag;
import com.abner.entity.bag.OrangeBag;
import com.abner.entity.fruit.Fruit;
import com.abner.entity.fruit.Orange;

public class OrangeFactory implements AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
