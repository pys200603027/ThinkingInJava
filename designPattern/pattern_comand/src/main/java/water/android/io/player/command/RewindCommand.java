package water.android.io.player.command;

import water.android.io.player.AudioPlayer;

public class RewindCommand extends Command {

    public RewindCommand(AudioPlayer player) {
        super(player);
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
