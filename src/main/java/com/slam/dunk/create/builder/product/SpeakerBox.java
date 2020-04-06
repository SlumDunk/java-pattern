package com.slam.dunk.create.builder.product;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class SpeakerBox implements Item {
    private String name;
    private float price;

    public SpeakerBox(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public float price() {
        return price;
    }

}

