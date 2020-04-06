package com.slam.dunk.structure.proxy;


import com.slam.dunk.service.OrderService;
import com.slam.dunk.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    /**
     * the real service we hold
     */
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {
        System.out.println("start the overseas order");
        return orderService.saveOrder();
    }
}
