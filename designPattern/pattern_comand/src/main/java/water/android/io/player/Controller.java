package water.android.io.player;

import water.android.io.player.command.Command;

/**
 * 控制器
 */
public class Controller {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public Controller(Command playCommand, Command rewindCommand, Command stopCommand) {
        this.playCommand = playCommand;
        this.rewindCommand = rewindCommand;
        this.stopCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void rewind() {
        rewindCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

}
