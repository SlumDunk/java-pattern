package com.slam.dunk.action.strategy;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class SecondDiscount implements Discount {
    @Override
    public int calculate(int money) {
        Double balance = money * 0.9;
        return balance.intValue();
    }
}
