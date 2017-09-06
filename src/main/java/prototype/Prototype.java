package prototype;

/**
 * Created by Nzm on 2017/8/25.
 */
public abstract class Prototype implements Cloneable {

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
