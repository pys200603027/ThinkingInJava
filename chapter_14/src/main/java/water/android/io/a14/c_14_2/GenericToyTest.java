package water.android.io.a14.c_14_2;

/**
 * 泛型与没有泛型的区别
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> tfClass = FancyToy.class;

        FancyToy fancyToy = tfClass.newInstance();
        Class<? super FancyToy> superclass = tfClass.getSuperclass();
        //这里会报错
//        Class<Toy> up=tfClass.getSuperclass();
        Object object = superclass.newInstance();
    }
}
