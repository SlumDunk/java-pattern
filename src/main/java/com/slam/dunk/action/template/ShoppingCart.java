package com.slam.dunk.action.template;


import com.slam.dunk.action.strategy.Discount;
import com.slam.dunk.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class ShoppingCart {
    private Discount discount;
    private List<Fruit> products = new ArrayList<>();

    public ShoppingCart(List<Fruit> products) {
        this.products = products;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     * main progress of submitting the order
     */
    public void submitOrder() {
        //calculate the total amount of money
        int money = balance();
        System.out.println("the total cost is $" + money);

        //calculate the money after discount
        money = discount.calculate(money);
        System.out.println("after discount, the cost is $" + money);

        //make the payment
        pay(money);

        //mail the products
        sendHome();

    }

    /**
     * calculate the total cost
     *
     * @return
     */
    private int balance() {
        int money = 0;
        System.out.print("the goods list is: ");
        for (Fruit fruit : products) {
            fruit.draw();
            System.out.print(",");
            money += fruit.price();
        }
        return money;
    }

    /**
     * mail the products
     */
    private void sendHome() {
        System.out.println("三公里以内，免费送货上门");
    }

    /**
     * pay the product
     * @param money
     */
    protected abstract void pay(int money);

}
