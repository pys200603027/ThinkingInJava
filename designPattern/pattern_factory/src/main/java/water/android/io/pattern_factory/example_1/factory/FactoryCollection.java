package water.android.io.pattern_factory.example_1.factory;

import water.android.io.pattern_factory.example_1.bean.HatchbackCar;
import water.android.io.pattern_factory.example_1.bean.ICar;
import water.android.io.pattern_factory.example_1.bean.JeepCar;
import water.android.io.pattern_factory.example_1.bean.SportCar;

public class FactoryCollection {

    public static class SportFactory implements IFactory {
        @Override
        public ICar crateCar() {
            return new SportCar();
        }
    }

    public static class JeepCarFactory implements IFactory {

        @Override
        public ICar crateCar() {
            return new JeepCar();
        }
    }

    public static class HatchbackCarFactory implements IFactory {

        @Override
        public ICar crateCar() {
            return new HatchbackCar();
        }
    }
}
