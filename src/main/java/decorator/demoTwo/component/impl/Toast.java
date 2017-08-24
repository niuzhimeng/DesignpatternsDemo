package decorator.demoTwo.component.impl;

import decorator.demoTwo.component.Breakfast;

/**
 * Created by Nzm on 2017/8/18.
 */
public class Toast extends Breakfast {

    public Toast() {
        super.description = "吐司";
    }

    @Override
    public Double cost() {
        return 10.00;
    }
}
