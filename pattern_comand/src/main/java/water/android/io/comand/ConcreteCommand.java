package water.android.io.comand;

/**
 * 命令实现者
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //真正执行命令者
        receiver.action();
    }
}
