package water.android.io.pattern.mediator.example1;

public class ConcreteColleagueB extends Colleague {
    @Override
    public void operation() {
        System.out.println("123 ConcreteColleagueB operation");
    }

    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }
}
