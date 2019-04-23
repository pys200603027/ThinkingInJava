package water.android.io.pattern.mediator.example3.colleague;

public class TuanZhiShu extends Colleague {
    public TuanZhiShu(String name) {
        super(name);
    }

    @Override
   public void talk() {
        System.out.println("团支书说:" + getCentent());
    }
}
