package water.android.io.a14.c_14_3_3;

import water.android.io.a14.c_14_3.animal.Pet;
import water.android.io.a14.c_14_3_1.Pets;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);

        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }

}
