package com.slam.dunk.create.builder;


/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public interface Builder {// It is also a factory

    /**
     * set apple
     *
     * @param price
     */
    void buildApple(int price);

    /**
     * set banana
     *
     * @param price
     */
    void buildBanana(int price);

    /**
     * set orange
     *
     * @param price
     */
    void buildOrange(int price);

    /**
     * get fruit meal
     *
     * @return
     */
    FruitMeal getFruitMeal();
}

