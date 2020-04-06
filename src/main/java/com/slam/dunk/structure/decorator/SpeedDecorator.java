package com.slam.dunk.structure.decorator;


import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class SpeedDecorator extends BagDecorator {
    public SpeedDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        //call the original method
        super.pack();
        speedy();
    }

    /**
     * speed the package
     */
    public void speedy() {
        System.out.println("------");
        System.out.println("speed the package");
    }
}
