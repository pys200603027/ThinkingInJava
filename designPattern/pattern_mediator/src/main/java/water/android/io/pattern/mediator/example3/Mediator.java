package water.android.io.pattern.mediator.example3;

import java.util.ArrayList;
import java.util.List;

import water.android.io.pattern.mediator.example3.colleague.Colleague;

/**
 * 中介者
 */
public abstract class Mediator {
    List<Colleague> studentList = new ArrayList<>();

    /**
     * 添加学生
     *
     * @param colleague
     */
    public void addStudent(Colleague colleague) {
        studentList.add(colleague);
    }

    /**
     * 广播
     *
     * @param colleague
     */
    public abstract void broadCast(Colleague colleague);

    /**
     * 私聊
     *
     * @param colleagueA
     * @param colleagueB
     */
    public abstract void privateChart(Colleague colleagueA, Colleague colleagueB);

}
