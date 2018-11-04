package water.android.io.pattern_factory.example_1;

import water.android.io.pattern_factory.example_1.bean.HatchbackCar;
import water.android.io.pattern_factory.example_1.bean.ICar;
import water.android.io.pattern_factory.example_1.bean.JeepCar;
import water.android.io.pattern_factory.example_1.bean.SportCar;

public class SimpleFactory {
    public ICar getCar(int type) {
        switch (type) {
            case ICar.HatchbackCarType:
                return new HatchbackCar();
            case ICar.JeepCarType:
                return new JeepCar();
            case ICar.SportCarType:
                return new SportCar();
            default:
                throw new RuntimeException("没有生产的车");
        }
    }
}
