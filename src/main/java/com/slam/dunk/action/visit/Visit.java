package com.slam.dunk.action.visit;


import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.fruit.Apple;
import com.slam.dunk.entity.fruit.Banana;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class Visit {

    /**
     * sell apple
     *
     * @param apple
     * @return
     */
    public int sell(Apple apple) {
        System.out.println("apple's price: ￥50");
        return 50;
    }

    /**
     * sell orange
     *
     * @param orange
     * @return
     */
    public int sell(Orange orange) {
        System.out.println("orange's price: ￥20");
        return 20;
    }

    /**
     * sell banana
     *
     * @param banana
     * @return
     */
    public int sell(Banana banana) {
        System.out.println("banana's price: ￥30");
        return 30;
    }

    /**
     * sell other fruit
     *
     * @param fruit
     * @return
     */
    public int sell(Fruit fruit) {
        System.out.println("other price: ￥10");
        return 10;
    }
}
