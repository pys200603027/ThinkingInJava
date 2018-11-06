package water.android.io.pattern_factory.example_1.bean;

public class SportCar extends AbstractCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("SportCar");
    }

    @Override
    public String getType() {
        return "双涡轮";
    }

    @Override
    public String getColor() {
        return "白色";
    }
}
