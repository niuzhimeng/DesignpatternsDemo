package MyProxy.StaticProxy.test;

import MyProxy.StaticProxy.Impl.AccountImpl;
import MyProxy.StaticProxy.Impl.AccountProxy;
import org.junit.Test;

public class MyTest {

    @Test
    public void test() {
        AccountImpl account = new AccountImpl();
        AccountProxy accountProxy = new AccountProxy(account);

        accountProxy.addAccount();
        accountProxy.updateAccount();
    }
}
