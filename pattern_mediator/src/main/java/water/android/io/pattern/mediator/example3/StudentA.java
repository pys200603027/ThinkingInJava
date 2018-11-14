package water.android.io.pattern.mediator.example3;

public class StudentA extends Colleague {

    public StudentA(String name) {
        super(name);
    }

    @Override
    void talk() {
        System.out.println("学生A说：" + getCentent());
    }
}
