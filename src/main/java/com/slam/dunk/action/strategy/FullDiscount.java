package com.slam.dunk.action.strategy;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class FullDiscount implements Discount {
    @Override
    public int calculate(int money) {
        if (money > 200) {
            System.out.println("discount 20 dollars");
            return money - 20;
        }
        return money;
    }
}
