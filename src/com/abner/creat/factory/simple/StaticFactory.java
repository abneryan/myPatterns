package com.abner.creat.factory.simple;

import com.abner.entity.fruit.Apple;
import com.abner.entity.fruit.Banana;
import com.abner.entity.fruit.Fruit;
import com.abner.entity.fruit.Orange;

/**
 * 简单工厂模式 --- 静态工厂模式
 */
public class StaticFactory {
    public static final int TYPE_APPLE = 1;
    public static final int TYPE_BANANA = 2;
    public static final int TYPE_ORANGE = 3;

    public static Fruit getFruit(int type){
        if(TYPE_APPLE == type){
            return new Apple();
        } else if (TYPE_BANANA == type){
            return new Banana();
        } else if(TYPE_ORANGE == type){
            return new Orange();
        }
        return null;
    }

    //多方法工厂
    public static Fruit getFruitApple(){
        return new Apple();
    }
    public static Fruit getFriotBanana(){
        return new Banana();
    }
    public static Fruit getFruitOrange(){
        return new Orange();
    }
}
