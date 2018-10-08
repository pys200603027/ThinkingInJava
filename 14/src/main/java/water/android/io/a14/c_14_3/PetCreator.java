package water.android.io.a14.c_14_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import water.android.io.a14.c_14_3.animal.Pet;

public abstract class PetCreator {

    private Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    /**
     * 通过Class 进行newInstancd
     * @return
     */
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
