package com.slam.dunk.action.chain;


import com.slam.dunk.action.strategy.Discount;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class MultiDiscount implements Discount {
    protected MultiDiscount nextMultyDiscount;

    public MultiDiscount(MultiDiscount nextMultyDiscount) {
        this.nextMultyDiscount = nextMultyDiscount;
    }

    @Override
    public int calculate(int money) {
        if (this.nextMultyDiscount != null) {
            return this.nextMultyDiscount.calculate(money);
        }
        return money;
    }

}
