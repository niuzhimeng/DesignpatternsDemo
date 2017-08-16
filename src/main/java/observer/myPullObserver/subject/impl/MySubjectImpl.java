package observer.myPullObserver.subject.impl;

import observer.myPullObserver.observer.MyPullObserver;
import observer.myPullObserver.subject.MySubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nzm on 2017/8/15.
 */
public class MySubjectImpl implements MySubject {

    private String title;

    private String message;

    private List<MyPullObserver> list = new ArrayList<>();

    @Override
    public void addObserver(MyPullObserver myObserver) {
        if (myObserver == null)
            throw new NullPointerException();
        if (!list.contains(myObserver)) {
            list.add(myObserver);
        }
    }

    @Override
    public void removeObserver(MyPullObserver myObserver) {
        list.remove(myObserver);
    }

    @Override
    public void notifyObserver() {
        list.forEach(MyPullObserver::update);
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String title, String message) {
        this.title = title;
        this.message = message;
        notifyObserver();
    }
}
