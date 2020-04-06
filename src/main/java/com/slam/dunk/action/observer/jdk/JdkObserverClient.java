package com.slam.dunk.action.observer.jdk;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class JdkObserverClient {


    public static void main(String[] args) {
        Mongo attentions = new Mongo("mongo");

        attentions.addObserver(new Customer("deer"));
        attentions.addObserver(new Customer("james"));
        attentions.addObserver(new Customer("lison"));
        attentions.addObserver(new Customer("mark"));

        attentions.perform();

    }


}
