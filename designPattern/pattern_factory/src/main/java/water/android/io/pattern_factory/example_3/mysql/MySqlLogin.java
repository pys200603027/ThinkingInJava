package water.android.io.pattern_factory.example_3.mysql;

import water.android.io.pattern_factory.example_3.ILogin;
import water.android.io.pattern_factory.example_3.bean.Login;

public class MySqlLogin implements ILogin {
    @Override
    public void insert(Login login) {
        System.out.println("MySql Login insert.");
    }

    @Override
    public Login getLogin() {
        System.out.println("MySql get Login.");
        return null;
    }
}
