package com.slam.dunk.structure.facade;


import com.slam.dunk.structure.bridge.bag.BagAbstraction;
import com.slam.dunk.structure.bridge.bag.SmallBag;
import com.slam.dunk.structure.bridge.material.Material;
import com.slam.dunk.structure.bridge.material.Paper;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class PickService {

    /**
     * pick fruit
     */
    public void doPick() {
        //size of bag
        BagAbstraction pickBag = new SmallBag();

        //material of bag
        Material material = new Paper();
        pickBag.setMaterial(material);

        //start to pick fruit
        pickBag.pick();
    }

    public void doOther() {
        System.out.println("other service");
    }
}
