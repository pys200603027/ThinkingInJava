package function.util;

import org.junit.Test;

public class MathTest {

    @Test
    public void test1() {

        double a = Math.pow(3.0, 2);
        double b = Math.pow(4.0, 2);

        double c = Math.sqrt(a + b);

        System.out.println(c);

    }
}
