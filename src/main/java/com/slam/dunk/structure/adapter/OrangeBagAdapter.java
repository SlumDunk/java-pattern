package com.slam.dunk.structure.adapter;


import com.slam.dunk.entity.bag.AppleBag;
import com.slam.dunk.entity.bag.OrangeBag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    public OrangeBagAdapter(AppleBag appleBag) {
        this.appleBag = appleBag;
    }

    @Override
    public void pack() {
        appleBag.pack();
    }
}
