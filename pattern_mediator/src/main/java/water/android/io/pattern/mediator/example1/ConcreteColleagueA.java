package water.android.io.pattern.mediator.example1;

public class ConcreteColleagueA extends Colleague {

    @Override
    public void operation() {
        System.out.println("123 ConcreteColleagueA operation");
    }

    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }
}
