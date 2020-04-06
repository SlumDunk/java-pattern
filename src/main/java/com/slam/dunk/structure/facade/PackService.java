package com.slam.dunk.structure.facade;


import com.slam.dunk.create.fatory.abstractfactory.AbstractFactory;
import com.slam.dunk.create.fatory.abstractfactory.AppleFactory;
import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.structure.decorator.CheckedBagDecorator;
import com.slam.dunk.structure.decorator.ReinforceBagDecorator;
import com.slam.dunk.structure.decorator.SpeedDecorator;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class PackService {

    /**
     * pack fruits
     */
    public void doPack() {
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
    }

    public void doOther() {
        System.out.println("other service");
    }
}
