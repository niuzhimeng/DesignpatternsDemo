package command.myCommand.impl;

import command.myCommand.Command;
import command.receiver.Receiver;

/**
 * Created by Nzm on 2017/9/22.
 */
public class CommandImpl implements Command {

    private Receiver receiver;

    public CommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
