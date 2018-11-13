package water.android.io.player.command;

import water.android.io.player.AudioPlayer;

public abstract class Command {

    protected AudioPlayer player;

    public Command(AudioPlayer player) {
        this.player = player;
    }

    public abstract void execute();
}
