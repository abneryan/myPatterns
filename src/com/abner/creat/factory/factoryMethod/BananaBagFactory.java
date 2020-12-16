package com.abner.creat.factory.factoryMethod;

import com.abner.entity.bag.Bag;
import com.abner.entity.bag.BananaBag;

public class BananaBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
