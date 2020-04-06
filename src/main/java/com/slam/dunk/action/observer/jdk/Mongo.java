package com.slam.dunk.action.observer.jdk;

import java.util.Observable;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class Mongo extends Observable {
    private String name;

    public Mongo(String name) {
        this.name = name;
    }

    /**
     * mongo is enough
     */
    public void perform() {
        this.setChanged();
        this.notifyObservers();
    }
}
