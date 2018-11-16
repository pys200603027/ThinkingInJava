package water.android.io.pattern.mediator.example2;

public class Wudang extends United {

    public Wudang(AbstractWulinMaster wulinMaster) {
        super(wulinMaster);
    }

    public void sendNoticeToMaster(String message) {
        wulinMaster.notice(message, this);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("武当派收到消息:" + message);
    }
}
