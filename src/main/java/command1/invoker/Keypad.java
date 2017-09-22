package command1.invoker;

import command1.myCommand.Command;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 请求者 -  键盘
 * Created by Nzm on 2017/9/22.
 */
@Data
@Accessors(chain = true)
@Builder
public class Keypad {

    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    /**
     * 执行播放方法
     */
    public void play() {
        playCommand.execute();
    }

    /**
     * 执行倒带方法
     */
    public void rewind() {
        rewindCommand.execute();
    }

    /**
     * 执行播放方法
     */
    public void stop() {
        stopCommand.execute();
    }
}