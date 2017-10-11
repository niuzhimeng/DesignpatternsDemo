package MyProxy.DynamicProxy.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Nzm on 2017/10/10.
 */
public class ProxyFactory {
    //维护一个目标对象
    private Object target;

    //给目标对象生成代理对象
    public Object getProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object result = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return result;
                    }
                }
        );
    }


    //给目标对象生成代理对象
    public Object getProxyInstance1(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始事务2");
                    //执行目标对象方法
                    Object result = method.invoke(target, args);
                    System.out.println("提交事务2");
                    return result;
                }
        );
    }
}
