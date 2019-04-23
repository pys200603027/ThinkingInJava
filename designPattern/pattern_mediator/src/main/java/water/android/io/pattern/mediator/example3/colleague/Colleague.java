package water.android.io.pattern.mediator.example3.colleague;

/**
 * 大学生
 */
public abstract class Colleague {

    private String name;
    private String centent;

    public Colleague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCentent() {
        return centent;
    }

    public void setCentent(String centent) {
        this.centent = centent;
    }

    /**
     * 发表言论
     */
    public abstract void talk();
}
