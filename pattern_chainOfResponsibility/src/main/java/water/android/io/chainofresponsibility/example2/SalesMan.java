package water.android.io.chainofresponsibility.example2;

public class SalesMan extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05) {
            System.out.println("SalesMan 批准了折扣");
        } else {
            next.processDiscount(discount);
        }
    }
}
