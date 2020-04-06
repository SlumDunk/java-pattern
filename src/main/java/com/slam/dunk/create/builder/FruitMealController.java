package com.slam.dunk.create.builder;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class FruitMealController {//checkout counter--director

    public void construct() {
//        Builder builder = new HolidayBuilder();
        Builder builder = new OldCustomerBuilder();

        //the template of code, doesn't change frequently
        builder.buildApple(120);
        builder.buildBanana(80);
        builder.buildOrange(50);

        FruitMeal fruitMeal = builder.getFruitMeal();


        int cost = fruitMeal.cost();
        System.out.println("the total cost of this meal: " + cost);
    }

    public static void main(String[] args) {
        new FruitMealController().construct();
    }

}
