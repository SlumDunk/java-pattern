package com.slam.dunk.create.fatory.abstractfactory;


import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.BananaBag;
import com.slam.dunk.entity.fruit.Banana;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BananaFactory extends AbstractFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
