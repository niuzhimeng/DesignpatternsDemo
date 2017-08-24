package factory.factory.impl;

import factory.factory.Pizza;
import factory.factory.PizzaStore;

/**
 * Created by Nzm on 2017/8/22.
 */
public class PizzaFactoryOne extends PizzaStore {
    @Override
    protected Pizza createPizza(Integer type) {
        Pizza pizza;
        switch (type) {
            case 1:
                pizza = new PizzaOne();
                break;
            case 2:
                pizza = new PizzaTwo();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
