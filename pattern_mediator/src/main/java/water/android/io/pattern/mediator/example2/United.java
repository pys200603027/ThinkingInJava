package water.android.io.pattern.mediator.example2;

public abstract class United {

    protected AbstractWulinMaster wulinMaster;

    public United(AbstractWulinMaster wulinMaster) {
        this.wulinMaster = wulinMaster;
    }

    public abstract void getNotice(String message);
}
