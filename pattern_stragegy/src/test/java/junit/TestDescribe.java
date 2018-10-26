package junit;

import org.junit.Test;

import static org.junit.Assert.*;

import water.android.io.pattern_stragegy.example_1.describe.ConcreteStragegy;
import water.android.io.pattern_stragegy.example_1.describe.Context;

public class TestDescribe {

    @Test
    public void testStragegy1() {
        Context context = new Context(new ConcreteStragegy.Stragegy1());
        context.contextInterface();
        assertNotNull(context);
    }

    @Test
    public void testStragegy2() {
        Context context = new Context(new ConcreteStragegy.Stragegy2());
        context.contextInterface();
        assertNotNull(context);
    }

    @Test
    public void testStragegy3() {
        Context context = new Context(new ConcreteStragegy.Stragegy3());
        context.contextInterface();
        assertNotNull(context);
    }
}
