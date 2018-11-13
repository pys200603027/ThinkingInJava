package water.android.io.gamepad;

public class FireCommand extends Command {

    public FireCommand(Hero hero) {
        super(hero);
    }

    @Override
    public void execute() {
        hero.fire();
    }

    @Override
    public void undo() {

    }
}
