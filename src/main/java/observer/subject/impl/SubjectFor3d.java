package observer.subject.impl;

import observer.observer.MyObserver;
import observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

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
        observerList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
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
