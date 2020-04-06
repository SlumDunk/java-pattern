package com.slam.dunk.create.fatory.fatorymethod;

import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.fruit.Banana;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
