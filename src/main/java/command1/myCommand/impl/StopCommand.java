package command1.myCommand.impl;

import command1.myCommand.Command;
import command1.receiver.AudioPlayer;

/**
 * Created by Nzm on 2017/9/22.
 */
public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
