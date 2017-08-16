package observer.myPushObserver.subject.impl;

import observer.myPushObserver.subject.Subject;
import observer.myPushObserver.observer.MyObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nzm on 2017/8/4.
 */
public class SubjectFor3d implements Subject {

    private List<MyObserver> observerList = new ArrayList<>();
    /**
     * 要发布的消息
     */
    private String message;

    @Override
    public void registerObserver(MyObserver observer) {
        if (observer == null)
            throw new NullPointerException();
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.updateMsg(message));
    }

    /**
     * 主题更新信息
     */
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
