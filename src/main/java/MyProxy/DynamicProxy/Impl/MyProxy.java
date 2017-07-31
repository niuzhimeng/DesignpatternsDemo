package MyProxy.DynamicProxy.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    private Object target;

    /**
     * ClassLoader loader：类加载器
     * Class<?>[] interfaces：得到全部的接口
     * InvocationHandler h：得到InvocationHandler接口的子类实例
     * <p>
     * Thread.currentThread().getContextClassLoader()
     */

    public Object getInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces()
                , this);
    }

    /**
     * @param proxy  指被代理的对象
     * @param method 要调用的方法
     * @param args   方法调用时所需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("before");
        //执行方法
        result = method.invoke(target, args);
        System.out.println("after");
        return result;
    }
}
