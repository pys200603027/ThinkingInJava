package water.android.io.pattern.mediator.example1;


public abstract class Colleague {
    protected Mediator mediator;

    public void addMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void operation();
}
