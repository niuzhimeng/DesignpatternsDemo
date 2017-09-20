package template;

import java.io.IOException;

/**
 * 咖啡因饮料
 * Created by Nzm on 2017/9/15.
 */
public abstract class CaffeineBeverage {

    public final void make() throws IOException {
        //烧水
        boilWater();
        //泡
        steep();
        //加调料
        if (ifAdd()) {
            addCondiments();
        }
        //倒入杯子
        pourInCup();
    }

    protected abstract void steep();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("烧水");
    }

    private void pourInCup() {
        System.out.println("倒入杯子");
    }

    protected Boolean ifAdd() throws IOException {
        return true;
    }
}
