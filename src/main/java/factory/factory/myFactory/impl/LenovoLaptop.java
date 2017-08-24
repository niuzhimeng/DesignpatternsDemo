package factory.factory.myFactory.impl;

import factory.factory.myFactory.Laptop;

/**
 * Created by Nzm on 2017/8/24.
 */
public class LenovoLaptop extends Laptop {

    private static final String brand = "联想";

    private static Integer initId;

    public LenovoLaptop() {
        super(brand);
        initId = 200;
    }

    @Override
    public String getId() {
        return "lenovo " + (initId++);
    }
}
