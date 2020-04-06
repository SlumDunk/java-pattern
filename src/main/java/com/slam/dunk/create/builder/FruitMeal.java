package com.slam.dunk.create.builder;


import com.slam.dunk.entity.fruit.Apple;
import com.slam.dunk.entity.fruit.Banana;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: a fruit meal
 */
public class FruitMeal {

    /**
     * price of apple
     */
    private Apple apple;

    /**
     * price of banana
     */
    private Banana banana;

    /**
     * price of orange
     */
    private Orange orange;

    /**
     * discount price
     */
    private int discount;

    /**
     * total price of meal
     */
    private int totalPrice;

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public int cost() {
        return this.totalPrice;
    }

    public void init() {
        if (null != apple) {
            totalPrice += apple.price();
        }
        if (null != orange) {
            totalPrice += orange.price();
        }
        if (null != banana) {
            totalPrice += banana.price();
        }
        if (totalPrice > 0) {
            totalPrice -= discount;
        }
    }

    public void showItems() {
        System.out.println("totalPrice：" + totalPrice);
    }
}

