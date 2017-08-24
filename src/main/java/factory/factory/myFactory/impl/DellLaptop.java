package factory.factory.myFactory.impl;

import factory.factory.myFactory.Laptop;

/**
 * 戴尔笔记本 -- 具体产品类
 * Created by Nzm on 2017/8/24.
 */
public class DellLaptop extends Laptop {

    private static final String brand = "戴尔";

    private static Integer initId;

    public DellLaptop() {
        super(brand);
        initId = 100;
    }

    @Override
    public String getId() {
        return "DELL " + (initId++);
    }
}
