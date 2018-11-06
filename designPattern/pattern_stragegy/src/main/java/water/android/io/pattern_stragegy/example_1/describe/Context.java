package water.android.io.pattern_stragegy.example_1.describe;

public class Context {

    private Stragegy stragegy;

    /**
     * 动态注入
     *
     * @param stragegy
     */
    public Context(Stragegy stragegy) {
        this.stragegy = stragegy;
    }

    public void contextInterface() {
        stragegy.stragegyInterface();
    }
}
