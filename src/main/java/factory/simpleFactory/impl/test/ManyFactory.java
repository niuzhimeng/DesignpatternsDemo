package factory.simpleFactory.impl.test;

import factory.simpleFactory.Noodle;
import factory.simpleFactory.impl.NoodleOne;
import factory.simpleFactory.impl.NoodleThree;
import factory.simpleFactory.impl.NoodleTwo;

/**
 * 多方法静态工厂
 * Created by Nzm on 2017/8/22.
 */
public class ManyFactory {

    public static Noodle makeOne() {
        return new NoodleOne();
    }

    public static Noodle makeTwo() {
        return new NoodleTwo();
    }

    public static Noodle makeThree() {
        return new NoodleThree();
    }
}
