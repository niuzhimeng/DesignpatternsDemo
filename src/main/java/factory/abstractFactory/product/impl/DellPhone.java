package factory.abstractFactory.product.impl;

import factory.abstractFactory.product.Phone;

/**
 * 戴尔手机
 * Created by Nzm on 2017/8/24.
 */
public class DellPhone implements Phone {
    @Override
    public void producePhone() {
        System.out.println("戴尔手机被制造");
    }
}
