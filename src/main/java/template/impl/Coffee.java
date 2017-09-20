package template.impl;

import template.CaffeineBeverage;

/**
 * Created by Nzm on 2017/9/15.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void steep() {
        System.out.println("泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加牛奶");
    }
}
