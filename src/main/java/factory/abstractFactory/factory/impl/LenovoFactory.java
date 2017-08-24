package factory.abstractFactory.factory.impl;

import factory.abstractFactory.factory.MyFactory;
import factory.abstractFactory.product.Phone;
import factory.abstractFactory.product.impl.LenovoPhone;
import factory.factory.myFactory.Laptop;
import factory.factory.myFactory.impl.LenovoLaptop;

/**
 * Created by Nzm on 2017/8/24.
 */
public class LenovoFactory implements MyFactory {
    @Override
    public Phone makePhone() {
        return new LenovoPhone();
    }

    @Override
    public Laptop makeLaptop() {
        return new LenovoLaptop();
    }
}
