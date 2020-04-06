package com.slam.dunk.structure.bridge.bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BigBag extends BagAbstraction {

    @Override
    public void pick() {
        System.out.println("start to pick fruits");
        this.material.draw();
        System.out.println("pick a big bag");
    }

}
