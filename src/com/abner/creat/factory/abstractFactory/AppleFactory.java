package com.abner.creat.factory.abstractFactory;

import com.abner.entity.bag.AppleBag;
import com.abner.entity.bag.Bag;
import com.abner.entity.fruit.Apple;
import com.abner.entity.fruit.Fruit;

public class AppleFactory implements AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
