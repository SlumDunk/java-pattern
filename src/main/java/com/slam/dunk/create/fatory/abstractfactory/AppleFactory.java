package com.slam.dunk.create.fatory.abstractfactory;


import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.bag.AppleBag;
import com.slam.dunk.entity.fruit.Apple;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
