package test;

import org.junit.Test;

import water.android.io.comand.Command;
import water.android.io.comand.ConcreteCommand;
import water.android.io.comand.Invoker;
import water.android.io.comand.Receiver;
import water.android.io.gamepad.FireCommand;
import water.android.io.gamepad.GamePad;
import water.android.io.gamepad.Hero;
import water.android.io.gamepad.JumpCommand;
import water.android.io.player.AudioPlayer;
import water.android.io.player.Controller;
import water.android.io.player.command.PlayCommand;
import water.android.io.player.command.RewindCommand;
import water.android.io.player.command.StopCommand;

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

    @Test
    public void test3() {
        AudioPlayer audioPlayer = new AudioPlayer();
        water.android.io.player.command.Command playCommand = new PlayCommand(audioPlayer);
        water.android.io.player.command.Command rewinCommand = new RewindCommand(audioPlayer);
        water.android.io.player.command.Command stopCommand = new StopCommand(audioPlayer);

        Controller controller = new Controller(playCommand, rewinCommand, stopCommand);

        controller.play();
        controller.rewind();
        controller.stop();
    }

    @Test
    public void test4() {
        Hero hero = new Hero();
        FireCommand commandA = new FireCommand(hero);
        FireCommand commandX = new FireCommand(hero);
        JumpCommand commandB = new JumpCommand(hero);
        JumpCommand commandY = new JumpCommand(hero);
        GamePad gamePad = new GamePad(commandA, commandB, commandX, commandY);

        gamePad.ButtonB();
        gamePad.ButtonA();

    }
}
