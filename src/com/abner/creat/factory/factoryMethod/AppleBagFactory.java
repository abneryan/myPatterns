package com.abner.creat.factory.factoryMethod;

import com.abner.entity.bag.AppleBag;
import com.abner.entity.bag.Bag;

public class AppleBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
