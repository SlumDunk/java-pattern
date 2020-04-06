package com.slam.dunk.action.observer;

//目标
public class ObserverClient {


    public static void main(String[] args) {
        //observe target
        MongoAttention attentions = new MongoAttention();

        //observer list
        attentions.add(new CustomerObserver("deer"));
        attentions.add(new CustomerObserver("james"));
        attentions.add(new CustomerObserver("lison"));
        attentions.add(new CustomerObserver("mark"));

        //target is ready, notify the observers
        attentions.perform();

    }


}
