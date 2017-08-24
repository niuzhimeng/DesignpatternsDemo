package factory.factory.myFactory;

/**
 * 抽象产品类 -- 笔记本电脑
 * Created by Nzm on 2017/8/24.
 */
public abstract class Laptop {

    private String brand;

    public Laptop() {
    }

    public Laptop(String brand) {
        this.brand = brand;
    }

    public abstract String getId();

    public void getDescription() {
        System.out.println("这是 " + brand + " 品牌的笔记本");
    }

}
