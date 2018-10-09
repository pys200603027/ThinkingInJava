package water.android.io.a14.c_14_5;

/**
 * instanceOf & Class的等价性
 */
public class FamilyVsExactType {

    static void print(String msg) {
        System.out.println(msg);
    }

    static void test(Object x) {
        print("Testing x of type " + x.getClass());
        print("x instanceOf Base " + (x instanceof Base));
        print("x instanceOf Defived " + (x instanceof Derived));
        print("Base.isInstance(x) " + Base.class.isInstance(x));
        print("Derived.isInstance(x) " + Derived.class.isInstance(x));

        print("x.getClass == Base.class " + (x.getClass() == Base.class));
        print("x.getClass == Derived.class " + (x.getClass() == Derived.class));

        print("x.getClass().equals(Base.class) " + (x.getClass().equals(Base.class)));
        print("x.getClass().equals(Derived.class) " + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        print("=============================");
        test(new Derived());
    }
}

class Base {
}

class Derived extends Base {
}
