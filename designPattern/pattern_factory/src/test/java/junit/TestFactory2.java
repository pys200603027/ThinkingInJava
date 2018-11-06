package junit;

import org.junit.Test;

import water.android.io.pattern_factory.example_2.abstracted.AbstractFactory;
import water.android.io.pattern_factory.example_2.abstracted.UnixFactory;
import water.android.io.pattern_factory.example_2.abstracted.WindowFactory;

public class TestFactory2 {
    /**
     * 抽象工厂模式经典
     */
    @Test
    public void test1() {
        AbstractFactory factory = new WindowFactory();

        factory.createButton().getButton();
        factory.createText().getText();
    }

    @Test
    public void test2() {
        AbstractFactory factory = new UnixFactory();
        factory.createText().getText();
        factory.createButton().getButton();
    }
}
