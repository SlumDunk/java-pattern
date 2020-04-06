package com.slam.dunk.action.observer;


/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class CustomerObserver implements Observer {

    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ", mongo is ready to buy");
    }
}
