package decorator.demoOne.component.impl;

import decorator.demoOne.component.Human;

/**
 * Created by Nzm on 2017/8/18.
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢。。");
    }
}
