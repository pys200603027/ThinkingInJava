package water.android.io.pattern_factory.example_1.factory;

import water.android.io.pattern_factory.example_1.bean.HatchbackCar;
import water.android.io.pattern_factory.example_1.bean.ICar;
import water.android.io.pattern_factory.example_1.bean.JeepCar;
import water.android.io.pattern_factory.example_1.bean.SportCar;

public class FactoryCollection {
    /**
     * 具体工厂类： 用于创建跑车类
     */
    public static class SportFactory implements IFactory {
        @Override
        public ICar crateCar() {
            return new SportCar();
        }
    }

    /**
     * 用于创建越野车类
     */
    public static class JeepCarFactory implements IFactory {

        @Override
        public ICar crateCar() {
            return new JeepCar();
        }
    }

    /**
     * 具体工厂类： 用于创建两厢车类
     */
    public static class HatchbackCarFactory implements IFactory {

        @Override
        public ICar crateCar() {
            // 这里就可以对于两厢车进行更加细的划分
            return new HatchbackCar();
        }
    }
}
