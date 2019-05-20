package test;

import com.example.pattern_adapter.example_2.adapter.Adapter;
import com.example.pattern_adapter.example_2.adapter.Adapter2;
import com.example.pattern_adapter.example_2.Laptop;
import com.example.pattern_adapter.example_2.Voltage220;
import com.example.pattern_adapter.example_2.adapter.AdapterTo5V;

import org.junit.Test;

public class Test2 {

    @Test
    public void test1() {
        Laptop laptop = new Laptop();
        laptop.charging(new Adapter());
    }

    /**
     * 用组合代替了继承
     */
    @Test
    public void test2() {
        Laptop laptop = new Laptop();
        laptop.charging(new Adapter2(new Voltage220()));
    }

    /**
     * 将适配器扩展成万能适配器
     */
    @Test
    public void test3() {
        Laptop laptop = new Laptop();
        laptop.charging(new AdapterTo5V(new Voltage220()));
    }
}
