package factory.simpleFactory.impl.test;

import factory.simpleFactory.Noodle;
import factory.simpleFactory.impl.NoodleFactory;
import factory.simpleFactory.impl.NoodleOne;
import factory.simpleFactory.impl.NoodleTwo;

/**
 * Created by Nzm on 2017/8/22.
 */

public class Test {

    @org.junit.Test
    public void test1() {
        Noodle noodle = NoodleFactory.makeNoodle(1);
        noodle.desc();
    }

    @org.junit.Test
    public void test2() {
        Noodle noodle = NoodleFactory.makeNoodle(NoodleTwo.class);
        noodle.desc();
    }

    @org.junit.Test
    public void test3() {
        Noodle noodle = ManyFactory.makeThree();
        noodle.desc();
    }

}
