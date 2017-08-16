package observer.myPullObserver.observer.impl;

import observer.myPullObserver.observer.MyPullObserver;
import observer.myPullObserver.subject.MySubject;
import observer.myPullObserver.subject.impl.MySubjectImpl;

/**
 * Created by Nzm on 2017/8/15.
 */
public class MyPullObserverImpl implements MyPullObserver {

    private MySubject mySubject;

    public MyPullObserverImpl(MySubject mySubject) {
        this.mySubject = mySubject;
        mySubject.addObserver(this);
    }

    @Override
    public void update() {
        if (mySubject instanceof MySubjectImpl) {
            MySubjectImpl mySubjectImpl = (MySubjectImpl) mySubject;
            if (mySubjectImpl.getTitle().contains("音乐")) {
                System.out.println("收到订阅的音乐咨询： " + mySubjectImpl.getMessage());
            }
        }
    }
}
