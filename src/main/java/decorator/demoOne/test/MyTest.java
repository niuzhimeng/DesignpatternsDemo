package decorator.demoOne.test;

import decorator.demoOne.decorator.impl.DecoratorOne;
import decorator.demoOne.decorator.impl.DecoratorThree;
import decorator.demoOne.decorator.impl.DecoratorTwo;
import decorator.demoOne.component.Human;
import decorator.demoOne.component.impl.Person;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/18.
 */
public class MyTest {

    @Test
    public void test2() {
        Human person = new Person();

//        person = new DecoratorOne(person);
//        person = new DecoratorTwo(person);
//        person = new DecoratorThree(person);

        //person = new DecoratorThree(new DecoratorTwo(new DecoratorOne(person)));

        person = new DecoratorOne(person);
        person.walkToWhere();
        System.out.println("============");
        person.wearClothes();
    }
}
