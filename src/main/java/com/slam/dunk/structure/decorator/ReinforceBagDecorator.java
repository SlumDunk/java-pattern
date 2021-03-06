package com.slam.dunk.structure.decorator;


import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class ReinforceBagDecorator extends BagDecorator {
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        //call the original pack() method
        super.pack();
        reinforce();
    }

    /**
     * enforce the package
     */
    public void reinforce() {
        System.out.println("------");
        System.out.println("enforce the package");
    }
}
