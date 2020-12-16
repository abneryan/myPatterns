package com.abner.structure.decorator;


import com.abner.creat.factory.abstractFactory.AbstractFactory;
import com.abner.creat.factory.abstractFactory.AppleFactory;
import com.abner.entity.bag.Bag;
import com.abner.entity.fruit.Fruit;

/**
 * 装饰器模式测试
 */
public class DecoratorClient {
    public static void main(String[] args){
        sendFruit();
    }

    public static void sendFruit(){
        AbstractFactory factory = new AppleFactory();

        //得到水果
        Fruit fruit = factory.getFruit();
        fruit.draw();
        //得到包装
        Bag bag = factory.getBag();

        //现需要增加防伪标识
        bag = new CheckedBagDecorator(bag);//防伪功能
        bag = new ReinforceBagDecorator(bag);//加固功能
        bag = new SpeedDecorator(bag);//加急功能

        bag.pack();

        //以下物流运输业务。。。。

    }



}
