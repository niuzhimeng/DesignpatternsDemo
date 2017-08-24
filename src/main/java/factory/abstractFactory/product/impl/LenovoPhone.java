package factory.abstractFactory.product.impl;

import factory.abstractFactory.product.Phone;

/**
 * Created by Nzm on 2017/8/24.
 */
public class LenovoPhone implements Phone {
    @Override
    public void producePhone() {
        System.out.println("联想手机被制造");
    }
}
