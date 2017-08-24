package factory.factory;

/**
 * Created by Nzm on 2017/8/22.
 */
public abstract class PizzaStore {

    public final Pizza orderNoodle(Integer type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.make();
        pizza.onTable();
        return pizza;
    }

    protected abstract Pizza createPizza(Integer type);

}
