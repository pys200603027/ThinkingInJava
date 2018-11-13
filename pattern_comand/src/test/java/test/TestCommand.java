package test;

import org.junit.Test;

import water.android.io.comand.Command;
import water.android.io.comand.ConcreteCommand;
import water.android.io.comand.Invoker;
import water.android.io.comand.Receiver;

public class TestCommand {

    @Test
    public void test1() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }

    @Test
    public void test2() {
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
        invoker.action();
    }
}
