package water.android.io.chainofresponsibility.example1;

public class CarHeadHandler extends AbstractCarHandler {

    @Override
    public void carHandler() {
        System.out.println("handle car head");

        this.doChain();
    }
}
