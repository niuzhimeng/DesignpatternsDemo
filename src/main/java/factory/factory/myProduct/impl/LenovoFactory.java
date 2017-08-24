package factory.factory.myProduct.impl;

import factory.factory.myFactory.Laptop;
import factory.factory.myFactory.impl.LenovoLaptop;
import factory.factory.myProduct.LaptopFactory;

/**
 * Created by Nzm on 2017/8/24.
 */
public class LenovoFactory implements LaptopFactory {
    @Override
    public Laptop produce() {
        return new LenovoLaptop();
    }

    @Override
    public void afterSaleService() {
        System.out.println("这是联想的售后");
    }
}
