package decorator.demoOne.decorator.impl;

import decorator.demoOne.decorator.Decorator;
import decorator.demoOne.component.Human;

/**
 * Created by Nzm on 2017/8/18.
 */
public class DecoratorThree extends Decorator {
    public DecoratorThree(Human human) {
        super(human);
    }

    private void findClothes() {
        System.out.println("找到一件貂皮大衣。。");
    }

    private void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}
