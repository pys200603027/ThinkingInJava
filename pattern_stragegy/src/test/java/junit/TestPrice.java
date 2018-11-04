package junit;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import water.android.io.pattern_stragegy.example_2.AdvancedMemberStrategy;
import water.android.io.pattern_stragegy.example_2.Price;

public class TestPrice {
    @Test
    public void testPrice() {
        Price price = new Price(new AdvancedMemberStrategy());
        double quote = price.quote(300);

        System.out.println("图书的最终价格为：" + quote);
    }
}
