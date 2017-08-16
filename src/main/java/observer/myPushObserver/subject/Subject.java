package observer.myPushObserver.subject;

import observer.myPushObserver.observer.MyObserver;

/**
 * 主题
 * Created by Nzm on 2017/8/4.
 */
public interface Subject {
    /**
     * 注册一个观察者
     */
    void registerObserver(MyObserver observer);

    /**
     * 移除一个观察者
     */
    void removeObserver(MyObserver observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();

}
