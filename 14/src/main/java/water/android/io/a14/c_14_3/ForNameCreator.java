package water.android.io.a14.c_14_3;

import java.util.ArrayList;
import java.util.List;

import water.android.io.a14.c_14_3.animal.Pet;

public class ForNameCreator extends PetCreator {

    private static String[] typeNames = {
            "water.android.io.a14.c_14_3.animal.Mutt",
            "water.android.io.a14.c_14_3.animal.Pug",
            "water.android.io.a14.c_14_3.animal.EgyptianMau",
            "water.android.io.a14.c_14_3.animal.Manx",
            "water.android.io.a14.c_14_3.animal.Cymric",
            "water.android.io.a14.c_14_3.animal.Rat",
            "water.android.io.a14.c_14_3.animal.Mouse",
            "water.android.io.a14.c_14_3.animal.Hamster"
    };

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    /**
     * 类型转换检查
     */
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
