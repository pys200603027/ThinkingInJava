package junit;

import org.junit.Test;

import water.android.io.pattern.mediator.example1.Colleague;
import water.android.io.pattern.mediator.example1.ConcreteColleagueA;
import water.android.io.pattern.mediator.example1.ConcreteColleagueB;
import water.android.io.pattern.mediator.example1.ConcreteMediator;
import water.android.io.pattern.mediator.example1.Mediator;
import water.android.io.pattern.mediator.example2.Emei;
import water.android.io.pattern.mediator.example2.Wudang;
import water.android.io.pattern.mediator.example2.WulinMaster;
import water.android.io.pattern.mediator.example3.Monitor;
import water.android.io.pattern.mediator.example3.QQMediator;
import water.android.io.pattern.mediator.example3.StudentA;
import water.android.io.pattern.mediator.example3.TuanZhiShu;

public class MediatorTest {

    /**
     * 中介者模式
     */
    @Test
    public void test1() {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);
        colleagueA.setMediator(mediator);
        colleagueB.setMediator(mediator);

        ((ConcreteColleagueA) colleagueA).notifyColleagueB();
        ((ConcreteColleagueB) colleagueB).notifyColleagueA();
    }

    @Test
    public void test2() {
        WulinMaster master = new WulinMaster();

        Wudang wudang = new Wudang(master);
        Emei emei = new Emei(master);

        master.setEmei(emei);
        master.setWudang(wudang);

        wudang.sendNoticeToMaster("武当弟子被少林大力金刚指所杀");
        emei.sendNoticeToMaster("峨眉弟子被少林大力金刚指所杀");
    }

    @Test
    public void test3() {
        QQMediator mediator = new QQMediator();
        Monitor studentMonitor = new Monitor("Vincent");
        TuanZhiShu tuanZhiShu = new TuanZhiShu("Robort");
        StudentA studentA = new StudentA("Tom");

        mediator.addStudent(studentA);
        mediator.addStudent(tuanZhiShu);
        mediator.addStudent(studentMonitor);

        studentMonitor.setCentent("明天下午2点开年级会，收到请回复");
        tuanZhiShu.setCentent("知道了，肯定到！");
        studentA.setCentent("收到，可能会晚到.");
        mediator.broadCast(studentMonitor);
    }

    @Test
    public void test4() {
        QQMediator mediator = new QQMediator();
        Monitor studentMonitor = new Monitor("Vincent");
        StudentA studentA = new StudentA("Tom");

        mediator.addStudent(studentA);
        mediator.addStudent(studentMonitor);

        studentMonitor.setCentent("你觉得咱们“软件项目管理老师”讲的怎么样？");
        studentA.setCentent("我觉得讲的不够生动，还点名，不太好!!");

        mediator.privateChart(studentMonitor,studentA);
    }
}
