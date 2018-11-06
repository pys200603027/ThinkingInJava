package water.android.io.pattern_factory.example_1.factory.abstracted;

import water.android.io.pattern_factory.example_1.bean.AbstractCar;
import water.android.io.pattern_factory.example_1.bean.equipment.AbstractBackpack;

public abstract class AbstractEquipment {

    public abstract AbstractCar createCar();

    public abstract AbstractBackpack createBackpack();
}
