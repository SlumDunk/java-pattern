package com.slam.dunk.structure.bridge.material;


/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class Paper implements Material {
    @Override
    public void draw() {
        System.out.print("use paper to make the bag");
    }

}
