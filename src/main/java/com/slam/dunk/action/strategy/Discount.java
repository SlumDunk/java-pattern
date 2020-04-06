package com.slam.dunk.action.strategy;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public interface Discount {
    /**
     * calculate money under different strategies
     *
     * @param money
     * @return
     */
    int calculate(int money);
}
