package water.android.io.pattern_temple;

/**
 * 炒菜的步骤
 */
public abstract class Cook {

    public final void cookProcess() {
        pourOil();
        headOil();
        pourFood();
        pourSauce();
        fry();
        finish();
    }

    void pourOil() {
        System.out.print("倒油 ");
    }

    void headOil() {
        System.out.print("热油 ");
    }

    abstract void pourFood();

    abstract void pourSauce();

    void fry() {
        System.out.print("翻炒 ");
    }

    void finish() {
        System.out.println("出锅");
    }
}
