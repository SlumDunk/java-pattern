package com.slam.dunk.entity.fruit;


import com.slam.dunk.action.visit.Visit;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.OrangeBag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: fruit interface
 */
public class Orange implements Fruit {
    private String name = "";
    private int price = 70;

    public Orange(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public void pack(OrangeBag bag) {
        bag.pack();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.print("oranges");
    }

    @Override
    public int accept(Visit visit) {
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
