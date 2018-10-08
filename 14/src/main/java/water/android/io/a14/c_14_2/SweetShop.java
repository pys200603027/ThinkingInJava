package water.android.io.a14.c_14_2;

/**
 * 验证类载入的过程
 */
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");

        new Candy();

        System.out.println("After creating Candy");

        try {
            Class.forName("Gum");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("After Class Gum");

        new Cookie();
        System.out.println("After Class Cookie");

    }
}
