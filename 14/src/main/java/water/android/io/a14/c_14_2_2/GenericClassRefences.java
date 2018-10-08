package water.android.io.a14.c_14_2_2;

/**
 * 泛化的Class引用
 */
public class GenericClassRefences {

    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;

        intClass = double.class;
        /**
         * 编译器错误
         */
//        genericIntClass=double.class;
    }
}
