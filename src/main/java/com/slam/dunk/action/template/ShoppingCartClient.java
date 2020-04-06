package com.slam.dunk.action.template;


import com.slam.dunk.action.strategy.Discount;
import com.slam.dunk.action.strategy.FullDiscount;
import com.slam.dunk.action.strategy.NewerDiscount;
import com.slam.dunk.action.strategy.SecondDiscount;
import com.slam.dunk.create.fatory.simplefactory.StaticFactory;
import com.slam.dunk.entity.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class ShoppingCartClient {

    private static Map<String, Discount> disCounts = new HashMap();

    static {
        disCounts.put("full", new FullDiscount());
        disCounts.put("newer", new NewerDiscount());
        disCounts.put("second", new SecondDiscount());
    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        //inject the discount offer
//        String discount = "second";
//        cart.setDiscount(disCounts.get(discount));

        cart.submitOrder();
    }


}
