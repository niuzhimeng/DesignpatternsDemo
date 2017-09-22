package command1.client;

import command1.invoker.Keypad;
import command1.myCommand.Command;
import command1.myCommand.impl.PlayCommand;
import command1.myCommand.impl.RewindCommand;
import command1.myCommand.impl.StopCommand;
import command1.receiver.AudioPlayer;
import org.junit.Test;

/**
 * 客户端
 * Created by Nzm on 2017/9/22.
 */
public class Girl {

    @Test
    public void test() {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //创建请求者对象
        Keypad keypad = Keypad.builder()
                .playCommand(playCommand)
                .rewindCommand(rewindCommand)
                .stopCommand(stopCommand).build();

        keypad.play();
        keypad.rewind();
        keypad.stop();
    }

}
