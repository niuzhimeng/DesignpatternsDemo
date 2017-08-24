package observer.jdkObserver.test;

import observer.jdkObserver.jdkObserver.MyTestObserver;
import observer.jdkObserver.jdkObserver.MyTestObserverTwo;
import observer.jdkObserver.jdkSubject.MyTestSubject;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/15.
 */
public class MyTest {

    @Test
    public void test1(){
        MyTestSubject myTestSubject = new MyTestSubject();

        MyTestObserver observer = new MyTestObserver(myTestSubject);
        MyTestObserverTwo testObserverTwo = new MyTestObserverTwo(myTestSubject);

        myTestSubject.setMessage("篮球",9);
    }
}
