package com.slam.dunk.create.fatory.fatorymethod;


import com.slam.dunk.entity.Bag;
import com.slam.dunk.entity.bag.BananaBag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BananaBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
