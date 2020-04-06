package com.slam.dunk.structure.proxy;

import com.slam.dunk.service.OrderService;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class ProxyClient {
    public static void main(String[] args) {
        saveOrder();
    }

    public static void saveOrder() {
        //local proxy
        OrderService orderService = new ProxyOrder();

        orderService.saveOrder();

        //other business

    }


}
