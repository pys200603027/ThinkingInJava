package water.android.io.chainofresponsibility.example2;

public class Manager extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.25) {
            System.out.println("Manager 批准");
        } else {
            next.processDiscount(discount);
        }
    }
}
