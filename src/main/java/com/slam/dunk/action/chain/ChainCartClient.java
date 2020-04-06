package com.slam.dunk.action.chain;


import com.slam.dunk.action.template.OtherPayShopping;
import com.slam.dunk.action.template.ShoppingCart;
import com.slam.dunk.create.fatory.simplefactory.StaticFactory;
import com.slam.dunk.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class ChainCartClient {

    /**
     * init the discount
     */
    private static MultiDiscount multyDiscount = new FullMultiDiscount(null);

    static {
        multyDiscount = new NewerMultiDiscount(multyDiscount);
        multyDiscount = new SecondMultiDiscount(multyDiscount);
        multyDiscount = new HolidayMultiDiscount(multyDiscount);


    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        //set the discount plan
        cart.setDiscount(multyDiscount);

        cart.submitOrder();
    }


}
