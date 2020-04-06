package com.slam.dunk.action.chain;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class NewerMultiDiscount extends MultiDiscount {
    public NewerMultiDiscount(MultiDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 100) {
            System.out.println("$20 discount for the new customer");
            money = money - 30;
        }
        return super.calculate(money);
    }
}
