package function.util.lang;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 范型测试
 */
public class GenericsTest {

    class Fruit {

    }

    class Apple extends Fruit {

    }

    class Plate<T> {
        private T item;

        public Plate(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    @Test
    public void test1() {

        //居然报错了 (范型进行多态描述的是，产生问题)
//        Plate<Fruit> p = new Plate<Apple>(new Apple());

        Plate<? extends Fruit> p = new Plate<Apple>(new Apple());
    }


    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////


    class Super {

    }

    class Self extends Super {

    }

    class Son extends Self {

    }


    @Test
    public void test2() {
        List<? extends Self> a = new ArrayList<>();

        //无法放入类型
//        a.add(new Son());
//        a.add(new Self());
//        a.add(new Super());

        //返回确定类型 Self
//        Self self = a.get(0);

        List<Self> b = new ArrayList<>();
        b.add(new Self());
    }

    class Demo<T> {
        T data;

        private void test() {
            //在处理的时候，可以直接当作Object来使用
            Object temp = data;
        }

        protected void test1() {

        }
    }

    class Demo2<T extends Demo> {
        T data;

        public void test() {
            //
            data.test1();
        }
    }

    class Demo3 {

    }

    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////

    //泛型擦出

    public interface Info<T> {
        T info(T var);
    }

    public class InfoImpl implements Info<Integer> {

        @Override
        public Integer info(Integer var) {
            return var;
        }
    }


    @Test
    public void test3() throws ClassNotFoundException {
        Class<?> clz = Class.forName(InfoImpl.class.getName());

        Method[] declaredMethods = clz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType().getSimpleName());
        }
    }


    @Test
    public void test4() {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Hello World");

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);

        System.out.println(a1.getClass() == a2.getClass());
    }

    @Test
    public void test5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        /**
         * 通过反射的方式加入了一个字符串
         */
        arrayList.getClass().getMethod("add", Object.class).invoke(arrayList, "asd");

        //looper
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
