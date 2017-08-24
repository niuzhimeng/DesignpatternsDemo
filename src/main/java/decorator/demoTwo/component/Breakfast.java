package decorator.demoTwo.component;

/**
 * Created by Nzm on 2017/8/18.
 */
public abstract class Breakfast {

    protected String description;

    /**
     * 获取食物的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
