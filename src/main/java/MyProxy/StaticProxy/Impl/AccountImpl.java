package MyProxy.StaticProxy.Impl;

import MyProxy.StaticProxy.Account;

public class AccountImpl implements Account {
    @Override
    public void addAccount() {
        System.out.println("add account");
    }

    @Override
    public void updateAccount() {
        System.out.println("update account");
    }
}
