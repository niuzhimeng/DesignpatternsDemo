package command;

/**
 * 命令接口
 * Created by Nzm on 2017/8/24.
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
