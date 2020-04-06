package com.slam.dunk.entity.fruit;


import com.slam.dunk.action.visit.Visit;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.AppleBag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: apple
 */
public class Apple implements Fruit {
    private int price = 100;

    public Apple() {

    }

    public Apple(int price) {
        this.price = price;
    }

    public void pack(AppleBag bag) {
        bag.pack();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.print("apples");
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int accept(Visit visit) {
        //send the real type of fruit
        return visit.sell(this);
    }

    public static void main(String[] args) {
        Visit visit = new Visit();
        new Apple().accept(visit);
    }
}
