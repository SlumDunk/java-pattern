package com.slam.dunk.create.fatory.abstractfactory;

import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OrderSendClient {
    public static void main(String[] args) {
        sendFruit();
    }

    public static void sendFruit() {
        //init factory
        AbstractFactory factory = new AppleFactory();

        //get fruit
        Fruit fruit = factory.getFruit();
        fruit.draw();
        //get bags
        Bag bag = factory.getBag();
        bag.pack();
        //mail service

    }


}
