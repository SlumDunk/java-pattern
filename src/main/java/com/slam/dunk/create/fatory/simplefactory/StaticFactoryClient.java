package com.slam.dunk.create.fatory.simplefactory;


import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class StaticFactoryClient {


    public static void main(String[] args) {
//        peterDo();
        jamesDo();
//        lisonDo();
    }

    public static void peterDo() {
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_BANANA);
        fruit.draw();
        //
        System.out.println("-----------------");
    }

    public static void jamesDo() {
        Fruit fruit = StaticFactory.getFruitBanana();
        fruit.draw();
        //
        System.out.println("-----------------");
    }

    public static void lisonDo() {
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        fruit.draw();
        System.out.println("-----------------");
    }
}
