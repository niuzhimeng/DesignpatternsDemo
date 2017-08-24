package command;

import command.impl.CreateCommand;
import org.apache.cxf.common.util.PropertyUtils;
import org.junit.Test;

/**
 * Created by Nzm on 2017/8/24.
 */
public class Client {

    @Test
    public void test(){
        //创建接收者
        Receiver receiver = new Receiver();

        //创建命令对象，并设置他的接收者
        Command command = new CreateCommand(receiver);
        //创建调用者，将命令对象设置进去
        Invoker invoker = new Invoker(command);

        invoker.runCommand();
        invoker.unDoCommand();
    }
}
