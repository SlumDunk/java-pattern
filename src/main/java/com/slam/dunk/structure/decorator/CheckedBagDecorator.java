package com.slam.dunk.structure.decorator;

import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class CheckedBagDecorator extends BagDecorator {
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        //call the origin pack() method
        super.pack();
        //add the Anti-counterfeit signs
        checked();
    }

    /**
     *
     */
    public void checked() {
        System.out.println("------");
        System.out.println("print the anti-counterfeit signs");
    }
}
