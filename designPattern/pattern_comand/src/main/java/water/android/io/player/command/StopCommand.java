package water.android.io.player.command;

import water.android.io.player.AudioPlayer;

public class StopCommand extends Command {

    public StopCommand(AudioPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.stop();
    }
}
