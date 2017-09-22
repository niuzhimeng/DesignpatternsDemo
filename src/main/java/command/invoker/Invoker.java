package command.invoker;

import command.myCommand.Command;

/**
 * 请求者
 * Created by Nzm on 2017/9/22.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
