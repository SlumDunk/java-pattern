package com.slam.dunk.create.fatory.fatorymethod;

import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class FactoryTest {

    private static FruitFactory fruitFactory;

    public static void main(String[] args) {
        //create the apple factory
        fruitFactory = new AppleFactory();

        peterdo();
        jamesdo();
        lisondo();
    }

    public static void peterdo() {
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //
        System.out.println("-----------------");
    }

    public static void jamesdo() {
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //
        System.out.println("-----------------");
    }

    public static void lisondo() {
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //
        System.out.println("-----------------");
    }

}
