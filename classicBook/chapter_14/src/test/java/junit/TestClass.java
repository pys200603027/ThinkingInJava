package junit;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestClass {

    /**
     * class对象获取,通过Class.forName
     */
    @Test
    public void a() throws ClassNotFoundException {

        Class.forName("water.android.io.a14.c_14_2.Candy");

        Class.forName("water.android.io.a14.c_14_2.Gum");
    }

    /**
     * Object.class(在内存的唯一性)
     */
    @Test
    public void ClassTest2() {
        assertEquals(Object.class, Object.class);

        Class<Object> aClass = Object.class;
    }

    @Test
    public void ClassTest3() {

    }
}
