package com.slam.dunk.create.fatory.abstractfactory;

import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class AbstractFactory {

    /**
     * get fruit
     *
     * @return
     */
    public abstract Fruit getFruit();

    /**
     * get bags of fruit
     *
     * @return
     */
    public abstract Bag getBag();

}
