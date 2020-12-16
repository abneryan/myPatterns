package com.abner.creat.factory.abstractFactory;

import com.abner.entity.bag.Bag;
import com.abner.entity.fruit.Fruit;

public interface AbstractFactory {
    Fruit getFruit();

    Bag getBag();
}