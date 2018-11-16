package water.android.io.chainofresponsibility.example2;

public abstract class PriceHandler {

    protected PriceHandler next;

    public void setSuccessor(PriceHandler next) {
        this.next = next;
    }

    public abstract void processDiscount(float discount);
}
