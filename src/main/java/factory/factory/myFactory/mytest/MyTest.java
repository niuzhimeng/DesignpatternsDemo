package factory.factory.myFactory.mytest;

import factory.factory.myFactory.Laptop;
import factory.factory.myProduct.LaptopFactory;
import factory.factory.myProduct.impl.DellFactory;
import factory.factory.myProduct.impl.LenovoFactory;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/24.
 */
public class MyTest {

    @Test
    public void test1() {
        LaptopFactory dellFactory = new DellFactory();
        Laptop laptop1 = dellFactory.produce();
        Laptop laptop2 = dellFactory.produce();

        laptop1.getDescription();
        System.out.println(laptop1.getId());

        laptop2.getDescription();
        System.out.println(laptop2.getId());

        //-----------------------------------------------

        LaptopFactory lenovoFactory = new LenovoFactory();
        Laptop lenovo1 = lenovoFactory.produce();
        Laptop lenovo2 = lenovoFactory.produce();

        lenovo1.getDescription();
        System.out.println(lenovo1.getId());

        lenovo2.getDescription();
        System.out.println(lenovo2.getId());

    }
}
