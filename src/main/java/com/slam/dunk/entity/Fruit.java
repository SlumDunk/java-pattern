package com.slam.dunk.entity;


import com.slam.dunk.action.visit.Visit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: fruit interface
 */
public interface Fruit {

    /**
     * price of fruit
     *
     * @return
     */
    int price();

    /**
     * gather fruit from trees
     */
    void draw();

    /**
     * Visit pattern
     *
     * @param visit
     * @return
     */
    int accept(Visit visit);

}
