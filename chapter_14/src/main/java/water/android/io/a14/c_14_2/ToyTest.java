package water.android.io.a14.c_14_2;

import java.lang.reflect.Field;

/**
 * 通过Class.forName()获取Class对象，同时获取其接口，父类信息，同时调用初始化
 */
public class ToyTest {

    public static void main(String[] args) {

        /**
         * 反射获取类对象
         */
        Class c = null;
        try {
            c = Class.forName("water.android.io.a14.c_14_2.FancyToy");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        /**
         * 通过类对象获取基本信息
         */
        printInfo(c);

        /**
         * 类接口名字打印
         */
        System.out.println("=======================");
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();

        Object obj = null;
        /**
         * 调用无参构造函数
         */
        try {
            obj = up.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println("=======================");
        printInfo(obj.getClass());
        /**
         * 通过类对象获取类中属性名字
         */
       for(Field file:c.getDeclaredFields()){
           System.out.println("file Name:"+file.getName());
       }

    }

    static void printInfo(Class cls) {
        System.out.println("Class Name:" + cls.getName() + ", is interface?[" + cls.isInterface() + "]");
        System.out.println("Simple Name:" + cls.getSimpleName());
        System.out.println("Canonical Name:" + cls.getCanonicalName());
    }
}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {

    public int i;
    public int[] is;

    FancyToy() {
        super(1);
    }
}
