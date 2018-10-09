package water.android.io.a14.c_14_3_1;

import java.util.ArrayList;

import water.android.io.a14.c_14_3.PetCreator;
import water.android.io.a14.c_14_3.animal.*;

public class Pets {

    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }

}
