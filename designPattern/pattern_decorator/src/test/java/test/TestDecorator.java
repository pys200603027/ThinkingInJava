package test;

import com.example.pattern_decorator.example_1.MilkyTeaA;
import com.example.pattern_decorator.example_1.MilkyTeaADecorator;
import com.example.pattern_decorator.example_1.MilkyTeaBDecorator;

import org.junit.Test;

public class TestDecorator {

    @Test
    public void test1() {
        MilkyTeaA milkyTea = new MilkyTeaA();

        MilkyTeaADecorator milkyTeaA = new MilkyTeaADecorator(milkyTea);
        MilkyTeaBDecorator milkyTeaB = new MilkyTeaBDecorator(milkyTea);


        milkyTeaA.recipe();
        milkyTeaB.recipe();
    }
}
