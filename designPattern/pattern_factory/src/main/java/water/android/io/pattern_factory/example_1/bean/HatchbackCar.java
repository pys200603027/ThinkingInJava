package water.android.io.pattern_factory.example_1.bean;

public class HatchbackCar extends AbstractCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("HatchbackCar");
    }

    @Override
    public String getType() {
        return "标准";
    }

    @Override
    public String getColor() {
        return "黑色";
    }
}
