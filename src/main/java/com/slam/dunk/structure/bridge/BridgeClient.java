package com.slam.dunk.structure.bridge;


import com.slam.dunk.structure.bridge.bag.BagAbstraction;
import com.slam.dunk.structure.bridge.bag.SmallBag;
import com.slam.dunk.structure.bridge.material.Material;
import com.slam.dunk.structure.bridge.material.Paper;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BridgeClient {

    public static void main(String[] args) {

        //size of bag
        BagAbstraction bag = new SmallBag();

        //material of bag
        Material material = new Paper();
        bag.setMaterial(material);

        //start to pick
        bag.pick();
    }
}
