package command;

/**
 * Created by Nzm on 2017/8/24.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void runCommand() {
        command.execute();
    }

    /**
     * 撤销命令
     */
    public void unDoCommand() {
        command.undo();
    }

}
