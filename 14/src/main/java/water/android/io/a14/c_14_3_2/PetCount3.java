package water.android.io.a14.c_14_3_2;

import java.util.LinkedHashMap;
import java.util.Map;

import water.android.io.a14.c_14_3.animal.*;
import water.android.io.a14.c_14_3_1.LiteralPetCreator;
import water.android.io.a14.c_14_3_1.Pets;

/**
 * 关于isInstance 和 instanceOf
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {

        public static Map<Class<? extends Pet>, Integer> MapData() {
            Map<Class<? extends Pet>, Integer> map = new LinkedHashMap<>();
            for (Class c : LiteralPetCreator.allTypes) {
                map.put(c, 0);
            }
            return map;
        }

        public PetCounter() {
            super(MapData());
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(",");
            }
            result.delete(result.length() - 1, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCounter = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCounter.count(pet);
        }
        System.out.println();
        System.out.println(petCounter);
    }
}
