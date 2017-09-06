package prototype.test;

import org.junit.Test;
import prototype.Father;
import prototype.Person;

/**
 * Created by Nzm on 2017/8/25.
 */
public class MyTest {

    @Test
    public void test1() throws Exception {
        Father father = new Father("父亲", "50");

        Person son = new Person();
        son.setAge("20");
        son.setName("儿子");
        son.setFather(father);

        Person brother = son.deepClone();
        System.out.println(brother.getName() + " " + brother.getAge());
        System.out.println(brother.getFather() == son.getFather());
    }
}
