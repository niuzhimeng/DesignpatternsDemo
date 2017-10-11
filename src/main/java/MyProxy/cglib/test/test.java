package MyProxy.cglib.test;

import MyProxy.cglib.CgUser;
import MyProxy.cglib.myInterceptor;
import org.junit.Test;

/**
 * Created by Nzm on 2017/7/31.
 */
public class test {

    @Test
    public void test() {
        myInterceptor myInterceptor = new myInterceptor(new CgUser());
        CgUser cgUser = (CgUser) myInterceptor.getProxyInstance();
        cgUser.add();
    }
}
