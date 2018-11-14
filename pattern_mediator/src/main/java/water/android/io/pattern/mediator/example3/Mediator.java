package water.android.io.pattern.mediator.example3;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    List<Colleague> studentList = new ArrayList<>();

    public void addStudent(Colleague colleague) {
        studentList.add(colleague);
    }

    public abstract void broadCast(Colleague colleague);

    public abstract void privateChart(Colleague colleagueA, Colleague colleagueB);

}
