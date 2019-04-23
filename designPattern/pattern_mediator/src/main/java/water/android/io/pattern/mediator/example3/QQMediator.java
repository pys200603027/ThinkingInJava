package water.android.io.pattern.mediator.example3;

import water.android.io.pattern.mediator.example3.colleague.Colleague;

/**
 * QQ中介者
 */
public class QQMediator extends Mediator {

    @Override
    public void broadCast(Colleague colleague) {
        colleague.talk();

        for (Colleague c : studentList) {
            if (c != colleague) {
                c.talk();
            }
        }
    }

    @Override
    public void privateChart(Colleague colleagueA, Colleague colleagueB) {
        colleagueA.talk();
        colleagueB.talk();
    }
}
