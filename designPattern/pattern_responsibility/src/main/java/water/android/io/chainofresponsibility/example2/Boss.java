package water.android.io.chainofresponsibility.example2;

public class Boss extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.50) {
            System.out.println("Boss 批准了折扣");
        } else {
            System.out.println("Boss 拒绝了折扣");
        }
    }
}
