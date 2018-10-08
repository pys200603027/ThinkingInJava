package water.android.io.a14.c_14_2_3;

public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();

        Class<House> houseType = House.class;

        House h = houseType.cast(b);

        h=(House) b;
    }
}

class Building {
}

class House extends Building {
}
