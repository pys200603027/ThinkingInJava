package water.android.io.pattern_singleton.example_1;
/**
 * 内部类的形式加载
 */
public class Singleton2{
    private Singleton2(){}

    private static class SingleTonInstance{
        private static final Singleton2 instance=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingleTonInstance.instance;
    }
}