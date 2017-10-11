package MyProxy.DynamicProxy.test;

import MyProxy.DynamicProxy.Account;
import MyProxy.DynamicProxy.Impl.AccountImpl;
import MyProxy.DynamicProxy.Impl.MyProxy;
import MyProxy.DynamicProxy.Impl.ProxyFactory;
import MyProxy.DynamicProxy.Impl.UserImpl;
import MyProxy.DynamicProxy.User;
import org.junit.Test;

public class MyTest {

    @Test
    public void test() {
        MyProxy myProxy = new MyProxy();
        Account account = (Account) myProxy.getInstance(new AccountImpl());

        account.addAccount();
        account.updateAccount();
    }

    @Test
    public void test1() {
        MyProxy myProxy = new MyProxy();
        User user = (User) myProxy.getInstance(new UserImpl());

        String nzm = user.update("nzm", " is good");
        System.out.println(nzm);
    }

    @Test
    public void test2() {
        ProxyFactory proxyFactory = new ProxyFactory();

        User user = (User) proxyFactory.getProxyInstance1(new UserImpl());
        String update = user.update("nzm", "is good");

    }
}
