package factory.abstractFactory.factory.test;

import factory.abstractFactory.factory.MyFactory;
import factory.abstractFactory.factory.impl.DellFactory;
import factory.abstractFactory.product.Phone;
import factory.factory.myFactory.Laptop;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/24.
 */
public class MyTest {

    @Test
    public void test() {
        MyFactory dellFactory = new DellFactory();
        Phone phone = dellFactory.makePhone();
        Laptop laptop = dellFactory.makeLaptop();

        phone.producePhone();
        laptop.getDescription();
        System.out.println(laptop.getId());
    }

}
