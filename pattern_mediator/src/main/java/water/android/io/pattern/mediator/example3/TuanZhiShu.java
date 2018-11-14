package water.android.io.pattern.mediator.example3;

public class TuanZhiShu extends Colleague {
    public TuanZhiShu(String name) {
        super(name);
    }

    @Override
    void talk() {
        System.out.println("团支书说:" + getCentent());
    }
}
