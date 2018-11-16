import org.junit.Test;

import water.android.io.chainofresponsibility.example1.AbstractCarHandler;
import water.android.io.chainofresponsibility.example1.CarBodyHandler;
import water.android.io.chainofresponsibility.example1.CarHeadHandler;
import water.android.io.chainofresponsibility.example1.CarTailHandler;
import water.android.io.chainofresponsibility.example2.PriceHandler;
import water.android.io.chainofresponsibility.example2.PriceHandlerFactory;

public class TestResponsibility {

    /**
     * 1. 新建处理链
     * 2。链路连接
     * 3. 从头开始
     * 有bug
     */
    @Test
    public void test1() {
        AbstractCarHandler carHeadHandler = new CarHeadHandler();
        AbstractCarHandler carBodyHandler = new CarBodyHandler();
        AbstractCarHandler carTailHandler = new CarTailHandler();

        carHeadHandler.setNextCarHandler(carBodyHandler);
        carBodyHandler.setNextCarHandler(carTailHandler);

        carHeadHandler.carHandler();
    }

    @Test
    public void test2() {
        PriceHandler pricehandler = PriceHandlerFactory.getPricehandler();
        pricehandler.processDiscount(0.88f);
        pricehandler.processDiscount(0.28f);
        pricehandler.processDiscount(0.01f);
    }
}
