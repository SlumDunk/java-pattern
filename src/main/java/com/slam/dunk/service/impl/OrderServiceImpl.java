package com.slam.dunk.service.impl;

import com.slam.dunk.service.OrderService;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description: local order
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public int saveOrder() {
        System.out.println("create order successfully, order#: 888888");
        return 888888;
    }
}
