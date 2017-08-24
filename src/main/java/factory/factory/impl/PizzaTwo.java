package factory.factory.impl;

import factory.factory.Pizza;

/**
 * Created by Nzm on 2017/8/22.
 */
public class PizzaTwo implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备PizzaTwo");
    }

    @Override
    public void make() {
        System.out.println("制作PizzaTwo");
    }

    @Override
    public void onTable() {
        System.out.println("pizzaTwo上桌");
    }
}
