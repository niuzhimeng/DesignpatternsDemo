package decorator.demoTwo.test;

import decorator.demoTwo.component.Breakfast;
import decorator.demoTwo.component.impl.Burger;
import decorator.demoTwo.component.impl.Toast;
import decorator.demoTwo.decorator.impl.Cheese;
import decorator.demoTwo.decorator.impl.Ham;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/18.
 */
public class MyTest {

    @Test
    public void test1() {
        //只点了一份吐司
        Breakfast toast = new Toast();
        System.out.println("您点的餐为：" + toast.getDescription() + "; 价钱： " + toast.cost());

        //吐司 + 双份火腿
        Breakfast toast1 = new Toast();
        toast1 = new Ham(new Ham(toast1));
        System.out.println("您点的餐为：" + toast1.getDescription() + "; 价钱： " + toast1.cost());

        //吐司 + 双份起司 + 火腿
        Breakfast toast2 = new Toast();
        toast2 = new Ham(new Cheese(new Cheese(toast2)));
        System.out.println("您点的餐为：" + toast2.getDescription() + "; 价钱： " + toast2.cost());

        //汉堡 + 起司 + 火腿
        Breakfast buger = new Burger();
        buger = new Cheese(new Ham(buger));
        System.out.println("您点的餐为：" + buger.getDescription() + "; 价钱： " + buger.cost());
    }
}
