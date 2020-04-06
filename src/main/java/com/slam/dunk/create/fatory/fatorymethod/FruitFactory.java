package com.slam.dunk.create.fatory.fatorymethod;


import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: interface of fruit factory
 */
public interface FruitFactory {
    /**
     * @return fruit
     */
    Fruit getFruit();
}
