package water.android.io.pattern.mediator.example1;

/**
 * 中介者
 */
public abstract class Mediator {
    protected Colleague colleagueA;
    protected Colleague colleagueB;

    public Mediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();

    public abstract void notifyColleagueB();

}
