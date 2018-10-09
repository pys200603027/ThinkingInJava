package water.android.io.a14.c_14_8;

import java.util.List;

import javax.security.sasl.SaslServer;

public interface Robot {
    String name();

    String mode();

    List<Operation> operations();


    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("null robot");
            }

            System.out.println("RobotName: " + r.name());
            System.out.println("Robot model: " + r.mode());

            for (Operation o : r.operations()) {
                System.out.println(o.description());
                o.commond();
            }
        }
    }
}
