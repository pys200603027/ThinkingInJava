package water.android.io.pattern_factory.example_1.bean.equipment;

public class SportBackpack extends AbstractBackpack {
    @Override
    public int getType() {
        return 1;
    }

    @Override
    public String getColor() {
        return "红黑色";
    }
}
