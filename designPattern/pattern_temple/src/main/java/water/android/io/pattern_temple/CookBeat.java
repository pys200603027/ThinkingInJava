package water.android.io.pattern_temple;

/**
 * 炒牛肉
 */
public class CookBeat extends Cook {
    @Override
    void pourFood() {
        System.out.print("放入牛肉 ");
    }

    @Override
    void pourSauce() {
        System.out.print("加盐、加酱油、加味精 ");
    }
}
