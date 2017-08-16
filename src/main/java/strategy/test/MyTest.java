package strategy.test;

import org.junit.Test;
import strategy.attack.impl.AttackJyImpl;
import strategy.defend.impl.DefendJzImpl;
import strategy.display.impl.BehaviorManImpl;

public class MyTest {
    @Test
    public void test1() {
        TestRole1 testRole1 = new TestRole1("nzm");

        testRole1.setIAttackBehavior(new AttackJyImpl());
        testRole1.setIDefendBehavior(new DefendJzImpl());
        testRole1.setISexBehavior(new BehaviorManImpl());

        testRole1.attack();
        testRole1.defend();
        testRole1.sex();
    }
}
