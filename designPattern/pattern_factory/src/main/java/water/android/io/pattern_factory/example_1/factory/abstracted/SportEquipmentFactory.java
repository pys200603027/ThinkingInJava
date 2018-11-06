package water.android.io.pattern_factory.example_1.factory.abstracted;

import water.android.io.pattern_factory.example_1.bean.AbstractCar;
import water.android.io.pattern_factory.example_1.bean.SportCar;
import water.android.io.pattern_factory.example_1.bean.equipment.AbstractBackpack;
import water.android.io.pattern_factory.example_1.bean.equipment.SportBackpack;

/**
 * 运动类型产品线：运动车，运动包
 */
public class SportEquipmentFactory extends AbstractEquipment {
    @Override
    public AbstractCar createCar() {
        return new SportCar();
    }

    @Override
    public AbstractBackpack createBackpack() {
        return new SportBackpack();
    }
}
