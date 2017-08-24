package decorator.demoOne.decorator;

import decorator.demoOne.component.Human;

/**
 * 抽象装饰者
 * Created by Nzm on 2017/8/18.
 */
public abstract class Decorator implements Human {
    /**
     * 超类的引用
     */
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
