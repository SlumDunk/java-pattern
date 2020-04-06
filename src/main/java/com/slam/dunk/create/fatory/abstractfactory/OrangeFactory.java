package com.slam.dunk.create.fatory.abstractfactory;


import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.OrangeBag;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OrangeFactory extends AbstractFactory {

    @Override
    public Fruit getFruit() {
        return new Orange("Peter", 50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
