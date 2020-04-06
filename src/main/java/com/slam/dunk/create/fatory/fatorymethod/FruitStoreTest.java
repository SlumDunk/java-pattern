package com.slam.dunk.create.fatory.fatorymethod;


import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class FruitStoreTest {

    private static FruitFactory fruitFactory;
    private static BagFactory bagFactory;

    public static void main(String[] args) {
        pack();
    }

    /**
     * pack fruit
     */
    public static void pack() {
        //init the apple factory, may confuse the fruit factories
        fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

        //init banana bag factory
        bagFactory = new BananaBagFactory();
        Bag bag = bagFactory.getBag();

        bag.pack();

        //mail business
    }


}
