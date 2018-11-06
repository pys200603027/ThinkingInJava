package water.android.io.pattern_singleton.example_1;

/**
 * Double Check
 */
public class Singleton {
    /**
     * 注意加入volatile
     */
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    //并不是一个原子操作
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 据说利用local variable 会增加25%的性能提升
     * Joshua Bloch "Effective Java, Second Edition", p. 283-284
     */
    public static Singleton getInstance2(){
        Singleton result=singleton;
        if(result==null){
            synchronized(Singleton.class){
                result=singleton;
                if(result ==null){
                    singleton=result=new Singleton();
                }
            }
        }
        return singleton;
    }
}
