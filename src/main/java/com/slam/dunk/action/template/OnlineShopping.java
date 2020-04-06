package com.slam.dunk.action.template;


import com.slam.dunk.entity.Fruit;
import com.slam.dunk.service.OrderService;
import com.slam.dunk.service.impl.OrderServiceImpl;

import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OnlineShopping extends ShoppingCart {
    private OrderService orderService = new OrderServiceImpl();

    public OnlineShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("use on-line payment, $5 discount, the cost is $" + (money - 5));
        int orderId = orderService.saveOrder();

    }
}
