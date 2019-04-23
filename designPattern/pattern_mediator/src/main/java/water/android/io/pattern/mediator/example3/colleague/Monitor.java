package water.android.io.pattern.mediator.example3.colleague;

public class Monitor extends Colleague {

    public Monitor(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("大班长说:" + getCentent());
    }
}
