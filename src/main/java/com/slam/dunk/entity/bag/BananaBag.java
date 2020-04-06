package com.slam.dunk.entity.bag;


import com.slam.dunk.entity.Bag;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--bags for packaging bananas");
    }
}
