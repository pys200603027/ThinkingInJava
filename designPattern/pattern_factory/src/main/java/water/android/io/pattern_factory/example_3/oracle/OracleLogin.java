package water.android.io.pattern_factory.example_3.oracle;

import water.android.io.pattern_factory.example_3.ILogin;
import water.android.io.pattern_factory.example_3.bean.Login;

public class OracleLogin implements ILogin {
    @Override
    public void insert(Login login) {
        System.out.println("Oracle Login insert.");
    }

    @Override
    public Login getLogin() {
        System.out.println("Oracle get Login.");
        return null;
    }
}
