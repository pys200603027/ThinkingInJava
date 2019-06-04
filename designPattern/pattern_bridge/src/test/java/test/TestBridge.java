package test;

import com.example.pattern_bridge.example_1.bridge.CountDisplay;
import com.example.pattern_bridge.example_1.bridge.Display;
import com.example.pattern_bridge.example_1.StringDisplayRaw;

import org.junit.Test;

public class TestBridge {

    @Test
    public void test1() {
        Display d1 = new Display(new StringDisplayRaw("Hello world"));
        d1.display();
    }

    @Test
    public void test2() {
        Display d2 = new CountDisplay(new StringDisplayRaw("Hello mars"));
        d2.display();
    }

    @Test
    public void test3() {
        CountDisplay d3=new CountDisplay(new StringDisplayRaw("Hello moon"));
        d3.display();
        d3.multiDisplay(3);
    }

}
