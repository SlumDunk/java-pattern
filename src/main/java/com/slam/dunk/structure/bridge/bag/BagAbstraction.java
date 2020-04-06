package com.slam.dunk.structure.bridge.bag;


import com.slam.dunk.structure.bridge.material.Material;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class BagAbstraction {
    protected Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * pick fruit
     */
    public abstract void pick();

}
