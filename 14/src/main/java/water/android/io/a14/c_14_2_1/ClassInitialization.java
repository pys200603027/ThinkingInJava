package water.android.io.a14.c_14_2_1;

import java.util.Random;

/**
 * 类初始化过程观察
 */
public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;

        System.out.println("After creating Initable ref");

        System.out.println(Initable.staticFinal);
        /**
         * 当尝试读取 Initable.staticFinal2的时候，就会初始化Initable类
         */
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticFinal);

        Class initable3 = Initable3.class;

        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticFinal);
    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static  int staticFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static final int staticFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}
