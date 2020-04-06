package com.slam.dunk.structure.decorator;


import com.slam.dunk.create.fatory.abstractfactory.AbstractFactory;
import com.slam.dunk.create.fatory.abstractfactory.AppleFactory;
import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class DecoratorClient {
    public static void main(String[] args) {
        sendFruit();
    }

    public static void sendFruit() {
        AbstractFactory factory = new AppleFactory();

        //get the fruit
        Fruit fruit = factory.getFruit();
        fruit.draw();
        //get the bag
        Bag bag = factory.getBag();

        //add anti-fake function
        bag = new CheckedBagDecorator(bag);
        //add reinforce function
        bag = new ReinforceBagDecorator(bag);
        // add speedy function
        bag = new SpeedDecorator(bag);

        bag.pack();

        //mail business

    }


}
