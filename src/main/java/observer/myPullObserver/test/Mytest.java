package observer.myPullObserver.test;

import observer.myPullObserver.observer.impl.MyPullObserverImpl;
import observer.myPullObserver.subject.impl.MySubjectImpl;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/15.
 */

public class Mytest {

    @Test
    public void test1() {
        MySubjectImpl mySubject = new MySubjectImpl();
        //注册
        MyPullObserverImpl observer = new MyPullObserverImpl(mySubject);
        //更新状态
        mySubject.setMessage("音乐","。。。。。。。。。");

    }
}
