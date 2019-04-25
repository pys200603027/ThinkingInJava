package unit;

import com.example.pattern_observer.example_1.Observable;
import com.example.pattern_observer.example_1.Observer;

import org.junit.Test;

public class TestExample1 {

    /**
     * 测试自己写的Observer
     */
    @Test
    public void test1() {
        Observer observer = (observable, obj) -> {
            String param = (String) obj;
            System.out.println("Hello My Observer. obj:" + param);
        };

        Observable observable = new Observable();
        observable.addObserver(observer);
        observable.notifyObserver("Param");

        observable.deleteObserver(observer);
    }

    /**
     * 测试Java 官方Observer
     */
    @Test
    public void test2() {
        java.util.Observer observer = (observable, o) -> {
            System.out.println("Hello Java Observer.");
        };

        java.util.Observable observable = new java.util.Observable();
        observable.addObserver(observer);
        /**
         * 这里是通知不到Observer的，因为没有setChanged
         */
        observable.notifyObservers();

        observable.deleteObservers();
    }
}
