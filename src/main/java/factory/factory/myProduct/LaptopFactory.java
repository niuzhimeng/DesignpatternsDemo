package factory.factory.myProduct;

import factory.factory.myFactory.Laptop;

/**
 * Created by Nzm on 2017/8/24.
 */
public interface LaptopFactory {
    /**
     * 生产笔记本
     *
     * @return 一台笔记本
     */
    Laptop produce();

    /**
     * 售后服务
     */
    void afterSaleService();
}
