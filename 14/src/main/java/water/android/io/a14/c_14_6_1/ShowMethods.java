package water.android.io.a14.c_14_6_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * 通过反射获取方法 & 构造方法
 */
public class ShowMethods {

    private static String useage = "useage ShowMethods qualified class name To show all methods in class or: ShowMethods qualfied class name word \n"
            + "To Search for methods involving world.";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) throws ClassNotFoundException {
        int lines = 0;

        Class<?> c = Class.forName("water.android.io.a14.c_14_5.FamilyVsExactType");
        Method[] methods = c.getMethods();
        Constructor<?>[] constructors = c.getConstructors();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

}
