package water.android.io.pattern.mediator.example3.colleague;

public class StudentA extends Colleague {

    public StudentA(String name) {
        super(name);
    }

    @Override
   public void talk() {
        System.out.println("学生A说：" + getCentent());
    }
}
