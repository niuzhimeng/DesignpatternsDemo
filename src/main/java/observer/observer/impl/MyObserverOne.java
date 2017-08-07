package observer.observer.impl;

import observer.observer.MyObserver;
import observer.subject.Subject;

/**
 * Created by Nzm on 2017/8/4.
 */
public class MyObserverOne implements MyObserver {

    public MyObserverOne(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void updateMsg(String msg) {
        System.out.println("111得到消息" + msg);
    }
}
