package com.slam.dunk.entity.fruit;


import com.slam.dunk.action.visit.Visit;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.BananaBag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: Banana
 */
public class Banana implements Fruit {
    private int price = 60;

    @Override
    public int price() {
        return price;
    }

    public void pack(BananaBag bag) {
        bag.pack();
    }

    @Override
    public void draw() {
        System.out.print("bananas");
    }

    @Override
    public int accept(Visit visit) {
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
