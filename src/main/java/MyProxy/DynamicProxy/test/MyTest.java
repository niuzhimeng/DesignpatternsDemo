package MyProxy.DynamicProxy.test;

import MyProxy.DynamicProxy.Account;
import MyProxy.DynamicProxy.Impl.AccountImpl;
import MyProxy.DynamicProxy.Impl.MyProxy;
import org.junit.Test;

public class MyTest {

    @Test
    public void test() {
        MyProxy myProxy = new MyProxy();
        Account account = (Account) myProxy.getInstance(new AccountImpl());

        account.addAccount();
        account.updateAccount();
    }
}
