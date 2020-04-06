package com.slam.dunk.action.chain;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class FullMultiDiscount extends MultiDiscount {
    public FullMultiDiscount(MultiDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 200) {
            System.out.println("give $20 if the amount of the order greater than 200");
            money = money - 20;
        }

        return super.calculate(money);
    }
}
