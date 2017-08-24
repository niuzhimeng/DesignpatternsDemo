package command.impl;

import command.Command;
import command.Receiver;

/**
 * Created by Nzm on 2017/8/24.
 */
public class CreateCommand implements Command {

    private Receiver receiver;

    public CreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unAction();
    }
}
