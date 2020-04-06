package com.slam.dunk.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class Attentions {
    /**
     * customer list need to be notified
     */
    protected List<Observer> observers = new ArrayList();

    /**
     * add observer
     *
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * remove observer
     *
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * notify observers
     */
    public abstract void notifyObservers();
}
