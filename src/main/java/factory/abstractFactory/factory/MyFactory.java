package factory.abstractFactory.factory;

import factory.abstractFactory.product.Phone;
import factory.factory.myFactory.Laptop;

/**
 * Created by Nzm on 2017/8/24.
 */
public interface MyFactory {
    /**
     * 制造手机
     *
     * @return
     */
    Phone makePhone();

    /**
     * 制造笔记本电脑
     *
     * @return
     */
    Laptop makeLaptop();
}
