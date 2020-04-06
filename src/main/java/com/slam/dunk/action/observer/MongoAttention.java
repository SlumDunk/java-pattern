package com.slam.dunk.action.observer;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class MongoAttention extends Attentions {

    @Override
    public void notifyObservers() {
        //iterate the observers list, call the update() method
        for (Observer obs : observers) {
            obs.update();
        }
    }

    /**
     * mongo is ready
     */
    public void perform() {
        this.notifyObservers();
    }
}
