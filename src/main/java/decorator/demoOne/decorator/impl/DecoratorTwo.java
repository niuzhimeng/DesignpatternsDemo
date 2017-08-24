package decorator.demoOne.decorator.impl;

import decorator.demoOne.decorator.Decorator;
import decorator.demoOne.component.Human;

/**
 * Created by Nzm on 2017/8/18.
 */
public class DecoratorTwo extends Decorator {
    public DecoratorTwo(Human human) {
        super(human);
    }

    private void goClotheCabinet() {
        System.out.println("去衣柜找找看。。");
    }

    private void findPlaceOnMap() {
        System.out.println("在Map上找找。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClotheCabinet();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}
