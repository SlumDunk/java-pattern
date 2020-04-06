package com.slam.dunk.action.template;


import com.slam.dunk.entity.Fruit;

import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class MembershipShopping extends ShoppingCart {


    public MembershipShopping(List<Fruit> products) {

        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("use membership card, $10 discount, the cost is " + (money - 10) + ", add scores " + 10 * money);
    }
}
