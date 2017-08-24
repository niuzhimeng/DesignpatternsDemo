package decorator.demoOne.decorator.impl;

import decorator.demoOne.decorator.Decorator;
import decorator.demoOne.component.Human;

/**
 * Created by Nzm on 2017/8/18.
 */
public class DecoratorOne extends Decorator {

    public DecoratorOne(Human human) {
        super(human);
    }

    private void goHome() {
        System.out.println("进房子。。");
    }

    private void findMap() {
        System.out.println("书房找找Map。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
