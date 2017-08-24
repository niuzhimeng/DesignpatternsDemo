package factory.factory.impl.test;

import factory.factory.PizzaStore;
import factory.factory.impl.PizzaFactoryOne;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/22.
 */
public class MyTest {

    @Test
    public void test1() {
        PizzaStore pizzaStore = new PizzaFactoryOne();
        pizzaStore.orderNoodle(1);
    }

}
