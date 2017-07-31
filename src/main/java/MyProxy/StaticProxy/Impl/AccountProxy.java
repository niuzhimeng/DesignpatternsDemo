package MyProxy.StaticProxy.Impl;

import MyProxy.StaticProxy.Account;

public class AccountProxy implements Account {

    private AccountImpl accountImpl;

    public AccountProxy(AccountImpl accountImpl) {
        this.accountImpl = accountImpl;
    }

    @Override
    public void addAccount() {
        System.out.println("add account before action");
        accountImpl.addAccount();
        System.out.println("add account after action");
    }

    @Override
    public void updateAccount() {
        System.out.println("update account before action");
        accountImpl.updateAccount();
        System.out.println("update account after action");
    }
}
