package water.android.io.pattern.mediator.example2;

public class WulinMaster extends AbstractWulinMaster {
    private Wudang wudang;
    private Emei emei;

    public void setEmei(Emei emei) {
        this.emei = emei;
    }

    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }

    @Override
    public void notice(String message, United united) {
        if (united == wudang) {
            emei.getNotice(message);
        } else if (united == emei) {
            wudang.getNotice(message);
        }
    }
}
