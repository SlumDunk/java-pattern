package com.slam.dunk.action.observer.jdk;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ", mongo is ready");
    }
}
