package factory.simpleFactory.impl;

import factory.simpleFactory.Noodle;

/**
 * Created by Nzm on 2017/8/22.
 */
public class NoodleOne implements Noodle {
    @Override
    public void desc() {
        System.out.println("面条One");
    }
}
