package com.slam.dunk.create.fatory;


import com.slam.dunk.entity.Fruit;
import com.slam.dunk.entity.fruit.Apple;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class PeterClient {

    public static void main(String[] args) {
        peterDo();
        jamesDo();
        lisonDo();
    }

    /**
     *
     */
    public static void peterDo() {
        Fruit fruit = new Apple();
        fruit.draw();
        //deal with fruit
        System.out.println("-----------------");
    }

    /**
     *
     */
    public static void jamesDo() {
        Fruit fruit = new Apple();
        fruit.draw();
        //deal with fruit
        System.out.println("-----------------");
    }

    /**
     *
     */
    public static void lisonDo() {
        Fruit fruit = new Orange("peter", 100);
        fruit.draw();
        //deal with fruit
        System.out.println("-----------------");
    }

}
