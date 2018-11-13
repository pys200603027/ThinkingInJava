package water.android.io.player.command;

import water.android.io.player.AudioPlayer;

public class PlayCommand extends Command {

    public PlayCommand(AudioPlayer player) {
       super(player);
    }

    @Override
    public void execute() {
        player.play();
    }
}
