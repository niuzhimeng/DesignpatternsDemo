package observer.jdkObserver.jdkObserver;

import observer.jdkObserver.jdkSubject.MyTestSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Nzm on 2017/8/16.
 */
public class MyTestObserverTwo implements Observer {
    private Observable observable;

    public MyTestObserverTwo(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MyTestSubject) {
            MyTestSubject myTestSubject = (MyTestSubject) o;
            Integer price = myTestSubject.getPrice();
            if (price < 100) {
                System.out.println("是two满意的价位，该商品为： " + arg + ", 当前价格为：" + price);
            }
            if (price >= 100) {
                System.out.println("价格太高，不关心是什么商品");
            }
        }
    }
}
