package decorator.demoTwo.decorator.impl;

import decorator.demoTwo.component.Breakfast;
import decorator.demoTwo.decorator.CondimentDecorator;

/**
 * Created by Nzm on 2017/8/18.
 */
public class Ham extends CondimentDecorator {

    public Ham(Breakfast breakfast) {
        super(breakfast);
    }

    @Override
    public Double cost() {
        return super.cost() + 10.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 火腿";
    }
}
