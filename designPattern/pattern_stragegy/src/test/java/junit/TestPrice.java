package junit;

import org.junit.Test;

import water.android.io.pattern_stragegy.example_2.strategy.AdvancedMemberStrategy;
import water.android.io.pattern_stragegy.example_2.strategy.IntermediateMemberStrategy;
import water.android.io.pattern_stragegy.example_2.Price;
import water.android.io.pattern_stragegy.example_2.strategy.PrimaryMemberStrategy;

public class TestPrice {
    @Test
    public void test1() {
        Price price = new Price(new AdvancedMemberStrategy());
        double quote = price.quote(300);

        System.out.println("图书的最终价格为：" + quote);
    }

    @Test
    public void test2() {
        Price price = new Price(new IntermediateMemberStrategy());
        double quote = price.quote(300);

        System.out.println("图书的最终价格为：" + quote);
    }

    @Test
    public void test3(){
        Price price = new Price(new PrimaryMemberStrategy());
        double quote = price.quote(300);

        System.out.println("图书的最终价格为：" + quote);
    }
}
