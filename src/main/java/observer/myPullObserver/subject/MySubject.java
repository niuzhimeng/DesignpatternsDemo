package observer.myPullObserver.subject;

import observer.myPullObserver.observer.MyPullObserver;

/**
 * Created by Nzm on 2017/8/15.
 */
public interface MySubject {

    void addObserver(MyPullObserver myObserver);

    void removeObserver(MyPullObserver myObserver);

    void notifyObserver();
}
