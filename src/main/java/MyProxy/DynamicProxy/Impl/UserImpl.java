package MyProxy.DynamicProxy.Impl;

import MyProxy.DynamicProxy.test.User;

/**
 * Created by Nzm on 2017/7/31.
 */
public class UserImpl implements User {
    @Override
    public String update(String name) {
        System.out.println("update");
        return "==" + name;
    }
}
