package decorator.demoTwo.component.impl;

import decorator.demoTwo.component.Breakfast;

/**
 * Created by Nzm on 2017/8/18.
 */
public class Burger extends Breakfast {

    public Burger() {
        super.description = "汉堡";
    }

    @Override
    public Double cost() {
        return 15.00;
    }
}
