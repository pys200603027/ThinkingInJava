package junit;

import org.junit.Test;

import water.android.io.pattern_factory.example_1.SimpleFactory;
import water.android.io.pattern_factory.example_1.bean.ICar;
import water.android.io.pattern_factory.example_1.factory.IFactory;

public class TestFactory {
    /**
     * 简单工厂模式
     */
    @Test
    public void test1() {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICar car = simpleFactory.getCar(ICar.HatchbackCarType);
        car.getCar();
    }

    @Test
    public void test2() {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICar car = simpleFactory.getCar(ICar.JeepCarType);
        car.getCar();
    }

    /**
     * 工厂模式
     *
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void test3() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IFactory factory = (IFactory) Class.forName("water.android.io.pattern_factory.example_1.factory.FactoryCollection$SportFactory").newInstance();
        factory.crateCar().getCar();
    }

    @Test
    public void test4() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IFactory factory = (IFactory) Class.forName("water.android.io.pattern_factory.example_1.factory.FactoryCollection$JeepCarFactory").newInstance();
        factory.crateCar().getCar();
    }
}
