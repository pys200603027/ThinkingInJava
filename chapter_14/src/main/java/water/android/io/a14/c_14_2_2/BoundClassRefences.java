package water.android.io.a14.c_14_2_2;

/**
 * 添加范型语法：提供编译器类型检查
 */
public class BoundClassRefences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
