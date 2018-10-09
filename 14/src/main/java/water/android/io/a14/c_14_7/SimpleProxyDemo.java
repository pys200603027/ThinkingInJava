package water.android.io.a14.c_14_7;

/**
 * 动态代理
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

/**
 * 有点像是组合模式
 */
class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething..");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface anInterface;

    public SimpleProxy(Interface anInterface) {

        this.anInterface = anInterface;
    }

    @Override
    public void doSomething() {
        System.out.println("proxy doSomething..");
        anInterface.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("proxy somethingElse " + arg);
        anInterface.somethingElse(arg);
    }
}
