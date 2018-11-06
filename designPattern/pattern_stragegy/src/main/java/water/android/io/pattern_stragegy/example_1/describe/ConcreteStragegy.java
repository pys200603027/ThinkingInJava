package water.android.io.pattern_stragegy.example_1.describe;

public class ConcreteStragegy {

    public static class Stragegy1 implements Stragegy {

        @Override
        public void stragegyInterface() {
            System.out.println("Stragegy1");
        }
    }

    public static class Stragegy2 implements Stragegy {

        @Override
        public void stragegyInterface() {
            System.out.println("Stragegy2");
        }
    }

    public static class Stragegy3 implements Stragegy {

        @Override
        public void stragegyInterface() {
            System.out.println("Stragegy3");
        }
    }
}
