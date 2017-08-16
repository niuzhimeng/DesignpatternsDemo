package observer.myPushObserver.observer.impl;

import observer.myPushObserver.subject.Subject;
import observer.myPushObserver.observer.MyObserver;

/**
 * Created by Nzm on 2017/8/4.
 */
public class MyObserverTwo implements MyObserver {

    private Subject subject;

    public MyObserverTwo(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void updateMsg(String msg) {
        System.out.println("two得到消息" + msg);
    }
}
