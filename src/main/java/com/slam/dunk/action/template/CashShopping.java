package com.slam.dunk.action.template;


import com.slam.dunk.entity.Fruit;

import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class CashShopping extends ShoppingCart {


    public CashShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("pay by cash, no extra discount");
    }
}
