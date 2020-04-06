package com.slam.dunk.create.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class SessionCount {
    private AtomicInteger count = new AtomicInteger(0);

    private static class InstanceHolder {
        public static SessionCount instance = new SessionCount();
    }

    /**
     * lazy initiation
     */
    private static SessionCount instance;

    private SessionCount() {
    }

    /**
     * double check
     *
     * @return
     */
    public static SessionCount getInstance() {
//        if (instance == null) {
//            synchronized (SessionCount.class) {
//                if (instance == null) {
//                    instance = new SessionCount();
//                }
//            }
//        }

//        return instance;
        return InstanceHolder.instance;
    }

    /***business methods***/
    public int plus() {
        return count.incrementAndGet();
    }

    public int decrease() {
        return count.decrementAndGet();
    }

    public void showMessage() {
        System.out.println("the current members is " + this.count.get());
    }


}
