package water.android.io.gamepad;

public class JumpCommand extends Command {

    public JumpCommand(Hero hero) {
        super(hero);
    }

    @Override
    public void execute() {
        hero.jump();
    }

    @Override
    public void undo() {

    }
}
