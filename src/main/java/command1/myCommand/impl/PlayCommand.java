package command1.myCommand.impl;

import command1.myCommand.Command;
import command1.receiver.AudioPlayer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Nzm on 2017/9/22.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
