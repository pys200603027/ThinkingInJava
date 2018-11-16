package water.android.io.chainofresponsibility.example1;

public class CarBodyHandler extends AbstractCarHandler {

    @Override
    public void carHandler() {
        System.out.println("handle car body");
        this.doChain();
    }
}
