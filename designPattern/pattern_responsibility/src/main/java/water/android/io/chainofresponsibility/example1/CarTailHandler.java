package water.android.io.chainofresponsibility.example1;

public class CarTailHandler extends AbstractCarHandler {


    @Override
    public void carHandler() {
        System.out.println("handle car tail");

        this.doChain();
    }
}
