package water.android.io.pattern_temple;

/**
 * 红烧鱼
 */
public class CookFish extends Cook {
    @Override
    void pourFood() {
        System.out.print("放入腌制鱼 ");
    }

    @Override
    void pourSauce() {
        System.out.print("放入盐、酱油、蒜葱 ");
    }
}
