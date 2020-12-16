package com.abner.creat.factory.factoryMethod;

import com.abner.entity.bag.Bag;
import com.abner.entity.bag.OrangeBag;

public class OrangeBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
