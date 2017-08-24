package factory.abstractFactory.factory.impl;

import factory.abstractFactory.factory.MyFactory;
import factory.abstractFactory.product.Phone;
import factory.abstractFactory.product.impl.DellPhone;
import factory.factory.myFactory.Laptop;
import factory.factory.myFactory.impl.DellLaptop;

/**
 * 戴尔工厂
 * Created by Nzm on 2017/8/24.
 */
public class DellFactory implements MyFactory {
    @Override
    public Phone makePhone() {
        return new DellPhone();
    }

    @Override
    public Laptop makeLaptop() {
        return new DellLaptop();
    }
}
