package com.slam.dunk.create.prototype;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Sheep old = new Sheep(2, "male", new Admin(25, "female"));
        System.out.println(old.toString());
        //clone the sheep
        Sheep current = old.clone();
        System.out.println(current.toString());

        //deal with the clone sheep
        current.setAge(1);
        current.setSex("female");
        current.getAdmin().setAge(34);
        current.getAdmin().setSex("male");
        System.out.println(old.toString());
        System.out.println(current.toString());
    }

}
