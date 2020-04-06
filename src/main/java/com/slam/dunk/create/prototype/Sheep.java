package com.slam.dunk.create.prototype;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class Sheep implements Cloneable {

    private int age;
    private String sex;
    /**
     * clone recursively
     */
    private Admin admin;

    public Sheep(int age, String sex, Admin admin) {
        super();
        this.age = age;
        this.sex = sex;
        this.admin = admin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Sheep [age=" + age + ", sex=" + sex + ", admin=" + admin + "]";
    }

    @Override
    public Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            sheep.admin = this.admin.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

}

