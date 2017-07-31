package MyProxy.cglib.test;

import MyProxy.cglib.CgUser;
import MyProxy.cglib.myInterceptor;
import org.assertj.core.internal.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Created by Nzm on 2017/7/31.
 */
public class test {

    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CgUser.class);
        enhancer.setCallback(new myInterceptor());

        CgUser cgUser = (CgUser) enhancer.create();
        cgUser.add();
    }
}
