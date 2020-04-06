package com.slam.dunk.action.chain;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class SecondMultiDiscount extends MultiDiscount {
    public SecondMultiDiscount(MultiDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        System.out.println("90% discount for the second order");
        Double balance = money * 0.9;

        return super.calculate(balance.intValue());
    }
}
