package com.slam.dunk.action.template;


import com.slam.dunk.entity.Fruit;

import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OtherPayShopping extends ShoppingCart {


    public OtherPayShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("pay by other methods");
    }

}
