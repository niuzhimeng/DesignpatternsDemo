package command;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * 命令接收者，命令真正执行的人
 * Created by Nzm on 2017/8/24.
 */
public class Receiver {

    public void action() {
        System.out.println("执行命令");
    }


    public void unAction() {
        System.out.println("撤销命令");
    }
}
