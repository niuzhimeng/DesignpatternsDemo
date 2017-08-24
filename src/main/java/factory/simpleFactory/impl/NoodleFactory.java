package factory.simpleFactory.impl;

import factory.simpleFactory.Noodle;

/**
 * Created by Nzm on 2017/8/22.
 */
public class NoodleFactory {
    /**
     * 1 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。
     *
     * 2 create()方法通常是静态的，所以也称之为静态工厂。
     *
     * 缺点
     *
     * 1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）
     *
     * 2 不同的产品需要不同额外参数的时候 不支持。
     */
    public static Noodle makeNoodle(Integer type) {
        switch (type) {
            case 1:
                return new NoodleOne();
            case 2:
                return new NoodleTwo();
            case 3:
                return new NoodleThree();
            default:
                return null;
        }
    }

    /**
     * 它也是一个具体的类，非接口 抽象类。但它的create()方法，是利用反射机制生成对象返回，
     * 好处是增加一种产品时，不需要修改create()的代码。
     *
     * 缺点
     *
     * 这种写法粗看牛逼，细想之下，不谈reflection的效率还有以下问题：
     *
     * 1 个人觉得不好，因为Class.forName(clz.getName()).newInstance()调用的是无参构造函数生成对象，它和new Object()是一样的性质，而工厂方法应该用于复杂对象的初始化 ，当需要调用有参的构造函数时便无能为力了，这样像为了工厂而工厂。
     *
     * 2 不同的产品需要不同额外参数的时候 不支持。
     */
    public static <T extends Noodle> Noodle makeNoodle(Class<T> tClass) {
        T result = null;
        try {
            result = tClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
