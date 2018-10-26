package water.android.io.a22;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 最简单的Java UI框架
 */
public class MyClass {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello Swing");
        JLabel jLabel = new JLabel("A Label");

        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }
}
