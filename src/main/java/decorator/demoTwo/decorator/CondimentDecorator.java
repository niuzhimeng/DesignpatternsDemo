package decorator.demoTwo.decorator;

import decorator.demoTwo.component.Breakfast;

/**
 * Created by Nzm on 2017/8/18.
 */
public abstract class CondimentDecorator extends Breakfast {

    private Breakfast breakfast;

    public CondimentDecorator(Breakfast breakfast) {
        this.breakfast = breakfast;
    }

    public String getDescription() {
        return breakfast.getDescription();
    }

    public Double cost() {
        return breakfast.cost();
    }
}
