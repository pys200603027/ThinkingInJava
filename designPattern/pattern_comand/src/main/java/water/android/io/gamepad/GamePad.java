package water.android.io.gamepad;

public class GamePad {

    Command buttonA;
    Command buttonB;
    Command buttonX;
    Command buttonY;

    public GamePad(Command buttonA, Command buttonB, Command buttonX, Command buttonY) {
        this.buttonA = buttonA;
        this.buttonB = buttonB;
        this.buttonX = buttonX;
        this.buttonY = buttonY;
    }

    public void ButtonA() {
        buttonA.execute();
    }

    public void ButtonB() {
        buttonB.execute();
    }

    public void ButtonX() {
        buttonX.execute();
    }

    public void ButtonY() {
        buttonY.execute();
    }
}
