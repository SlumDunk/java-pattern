package com.slam.dunk.structure.decorator;


import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BagDecorator implements Bag {
    /**
     * maintain a reference to the real bag
     */
    private Bag bag;

    public BagDecorator(Bag bag) {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
