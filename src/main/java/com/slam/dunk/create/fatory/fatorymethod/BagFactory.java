package com.slam.dunk.create.fatory.fatorymethod;

import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public interface BagFactory {
    /**
     * get bags
     *
     * @return
     */
    public Bag getBag();
}
