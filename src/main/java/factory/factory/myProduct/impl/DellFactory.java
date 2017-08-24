package factory.factory.myProduct.impl;

import factory.factory.myFactory.Laptop;
import factory.factory.myFactory.impl.DellLaptop;
import factory.factory.myProduct.LaptopFactory;

/**
 * 联想工厂
 * Created by Nzm on 2017/8/24.
 */
public class DellFactory implements LaptopFactory {
    @Override
    public Laptop produce() {
        return new DellLaptop();
    }

    @Override
    public void afterSaleService() {
        System.out.println("这是戴尔的售后");
    }
}
