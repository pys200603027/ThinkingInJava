package water.android.io.a14.c_14_3_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import water.android.io.a14.c_14_3.PetCreator;
import water.android.io.a14.c_14_3.animal.*;

/**
 * forName & Class.class之间的关系
 */
public class LiteralPetCreator extends PetCreator {
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
            Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class,
            Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class
    ));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
