package observer.jdkObserver.jdkSubject;

import java.util.Observable;

/**
 * Created by Nzm on 2017/8/15.
 */
public class MyTestSubject extends Observable {

    private String name;

    private Integer price;

    public MyTestSubject() {
    }

    public String getName() {
        return name;
    }

    public void setMessage(String name, Integer price) {
        this.name = name;
        this.price = price;
        this.setChanged();
        this.notifyObservers(name);
    }

    public Integer getPrice() {
        return price;
    }
}
