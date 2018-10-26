package junit;

import org.junit.Test;
import static org.junit.Assert.*;

import water.android.io.pattern_singleton.example_1.SingleTon3;
import water.android.io.pattern_singleton.example_1.Singleton;
import water.android.io.pattern_singleton.example_1.Singleton2;

public class SingleTonTest {

    @Test
    public void testSingle() {

        assertEquals(Singleton.getInstance(), Singleton.getInstance());
    }

    @Test
    public void testSingle2(){
        assertEquals(Singleton2.getInstance(), Singleton2.getInstance());
    }

    @Test
    public void TestSingle3(){
        assertEquals(SingleTon3.INSTANCE, SingleTon3.INSTANCE);
    }
}
