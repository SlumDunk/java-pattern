package com.slam.dunk.action.visit;


import com.slam.dunk.create.fatory.simplefactory.StaticFactory;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.fruit.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class VisitClient {
    private static Visit visit = new Visit();
    //storage of goods
    private static List<Fruit> list = new ArrayList<>();

    static {
        list.add(StaticFactory.getFruitApple());
        list.add(StaticFactory.getFruitOrange());
        list.add(StaticFactory.getFruitBanana());
        list.add(StaticFactory.getFruitApple());
        list.add(StaticFactory.getFruitOrange());
    }

    /**
     * calculate the total payment
     *
     * @return
     */
    private static int makePayment() {
        int total = 0;
        for (Fruit fruit : list) {
            //could not behave rightly
//            total += visit.sell(fruit);
            total += fruit.accept(visit);
        }

        System.out.println("the total payment is" + total);
        return total;
    }

    public static void main(String[] args) {
        makePayment();
    }

    /**
     *
     */
    private static void test1() {
        Apple apple = new Apple();
        Fruit fruit = apple;

        //could not distinguish the real type of fruit
        int price = visit.sell(fruit);
        System.out.println("the price of fruit" + price);

        price = visit.sell(apple);
        System.out.println("the price of apple" + price);
    }

    /**
     * use visitor pattern, solve the problem
     */
    private static void test2() {
        Apple apple = new Apple();
        Fruit fruit = apple;

        int price = fruit.accept(visit);
        System.out.println("the price is" + price);
    }
}
