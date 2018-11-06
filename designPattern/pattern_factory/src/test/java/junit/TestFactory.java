package junit;

import org.junit.Test;

import water.android.io.pattern_factory.example_1.bean.AbstractCar;
import water.android.io.pattern_factory.example_1.bean.equipment.AbstractBackpack;
import water.android.io.pattern_factory.example_1.factory.SimpleFactory;
import water.android.io.pattern_factory.example_1.bean.ICar;
import water.android.io.pattern_factory.example_1.factory.IFactory;
import water.android.io.pattern_factory.example_1.factory.abstracted.AbstractEquipment;
import water.android.io.pattern_factory.example_1.factory.abstracted.SportEquipmentFactory;

public class TestFactory {
    /**
     * 简单工厂模式,一个工厂负责所有Bean类型的生产
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
     * 工厂模式:一个工厂对应一种类型Bean
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

    /**
     * 抽象工厂:对应了一个产品线系列，旗下有各种样品
     */
    @Test
    public void test5() {
        AbstractEquipment equipment = new SportEquipmentFactory();

        AbstractCar car = equipment.createCar();
        AbstractBackpack backpack = equipment.createBackpack();

        System.out.println("Car:" + car.getType() + ",Color:" + car.getColor());
    }
}
