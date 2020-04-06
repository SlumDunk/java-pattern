package com.slam.dunk.action.chain;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class HolidayMultiDiscount extends MultiDiscount {
    public HolidayMultiDiscount(MultiDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 20) {
            System.out.println("$5 discount on holiday");
            money = money - 5;
        }
        return super.calculate(money);
    }
}
