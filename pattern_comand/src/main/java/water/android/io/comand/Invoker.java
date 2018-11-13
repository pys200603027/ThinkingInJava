package water.android.io.comand;

public class Invoker {

    private Command command;


    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动
     */
    public void action() {
        command.execute();
    }
}
