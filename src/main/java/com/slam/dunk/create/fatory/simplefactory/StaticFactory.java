package com.slam.dunk.create.fatory.simplefactory;


import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.fruit.Apple;
import com.slam.dunk.entity.fruit.Banana;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class StaticFactory {
    /**
     * apple
     */
    public static final int TYPE_APPLE = 1;
    /**
     * orange
     */
    public static final int TYPE_ORANGE = 2;
    /**
     * banana
     */
    public static final int TYPE_BANANA = 3;

    public static Fruit getFruit(int type) {
        if (TYPE_APPLE == type) {
            return new Apple();
        } else if (TYPE_ORANGE == type) {
            return new Orange("Peter", 80);
        } else if (TYPE_BANANA == type) {
            return new Banana();
        }
        return null;
    }

    /**
     * multiple methods factory
     * get apple
     *
     * @return
     */
    public static Fruit getFruitApple() {
        return new Apple();
    }

    /**
     * get orange
     *
     * @return
     */
    public static Fruit getFruitOrange() {
        return new Orange("Peter", 80);
    }

    /**
     * get banana
     *
     * @return
     */
    public static Fruit getFruitBanana() {
        return new Banana();
    }


}
