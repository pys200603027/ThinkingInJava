package water.android.io.gamepad;

public abstract class Command {
    protected Hero hero;

    public Command(Hero hero) {
        this.hero = hero;
    }

    public abstract void execute();

    public abstract void undo();
}
