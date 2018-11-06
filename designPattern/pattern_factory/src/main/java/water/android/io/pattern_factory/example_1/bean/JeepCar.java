package water.android.io.pattern_factory.example_1.bean;

public class JeepCar extends AbstractCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("JeepCar");
    }

    @Override
    public String getType() {
        return "强力";
    }

    @Override
    public String getColor() {
        return "迷彩";
    }
}
