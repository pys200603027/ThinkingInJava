package water.android.io.chainofresponsibility.example1;

public abstract class AbstractCarHandler {
    AbstractCarHandler next = null;

    public abstract void carHandler();

    public AbstractCarHandler setNextCarHandler(AbstractCarHandler next) {
        this.next = next;
        return this;
    }

    protected void doChain() {
        if (next != null) {
            next.carHandler();
        }
    }
}
