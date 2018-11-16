package water.android.io.pattern.mediator.example2;

public class Emei extends United {

    public Emei(AbstractWulinMaster wulinMaster) {
        super(wulinMaster);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("峨眉派收到消息:" + message);
    }

    public void sendNoticeToMaster(String message) {
        wulinMaster.notice(message, this);
    }

}
