package water.android.io.a20.c_20_5;

import org.junit.Test;

import sun.misc.OSEnvironment;

public class AtUnitExample {
    public String methodOne() {
        return "This is methodOne.";
    }

    public int methodTwo() {
        System.out.println("This is method two.");
        return 2;
    }

    @Test
    public boolean methodOneTest() {
        return methodOne().equals("This is methodOne.");
    }

    @Test
    public boolean m2() {
        return methodTwo() == 2;
    }

    @Test
    public boolean m3() {
        return true;
    }

    @Test
    public boolean failureTest() {
        return false;
    }

    @Test
    public static boolean anotherDisppointment() {
        return false;
    }

    public void main(String[] args) {

        System.out.println("This is demo");
    }
}
