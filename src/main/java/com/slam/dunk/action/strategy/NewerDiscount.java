package com.slam.dunk.action.strategy;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class NewerDiscount implements Discount {
    @Override
    public int calculate(int money) {
        if (money > 100) {
            return money - 20;
        }
        return money;
    }
}
