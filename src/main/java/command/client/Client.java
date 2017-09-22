package command.client;

import command.invoker.Invoker;
import command.myCommand.Command;
import command.myCommand.impl.CommandImpl;
import command.receiver.Receiver;
import org.junit.Test;

/**
 * 客户端
 * Created by Nzm on 2017/9/22.
 */
public class Client {

    @Test
    public void test() {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new CommandImpl(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}
