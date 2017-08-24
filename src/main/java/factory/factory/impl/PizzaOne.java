package factory.factory.impl;

import factory.factory.Pizza;

/**
 * Created by Nzm on 2017/8/22.
 */
public class PizzaOne implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备PizzaOne");
    }

    @Override
    public void make() {
        System.out.println("制作PizzaOne");
    }

    @Override
    public void onTable() {
        System.out.println("PizzaOne上桌");
    }
}
