package observer.myPushObserver.test;

import observer.myPushObserver.observer.impl.MyObserverTwo;
import observer.myPushObserver.observer.impl.MyObserverOne;
import observer.myPushObserver.subject.impl.SubjectFor3d;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/4.
 */
public class MyTest {

    @Test
    public void ObServerTest(){
        SubjectFor3d subjectFor3d = new SubjectFor3d();

        MyObserverOne one = new MyObserverOne(subjectFor3d);
        MyObserverTwo two = new MyObserverTwo(subjectFor3d);

        //subjectFor3d.removeObserver(two);

        subjectFor3d.setMessage("666");
    }
}
