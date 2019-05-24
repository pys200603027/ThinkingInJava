package test;

import com.example.pattern_facade.example_1.Computer;

import org.junit.Test;

public class Test1 {

    @Test
    public void test1() {
        Computer computer = new Computer();
        computer.start();
        computer.shutDown();
    }
}
