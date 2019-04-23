package water.android.io.pattern_factory.example_3.mysql;

import water.android.io.pattern_factory.example_3.IFactory;
import water.android.io.pattern_factory.example_3.ILogin;
import water.android.io.pattern_factory.example_3.IUser;

public class MySqlFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public ILogin createLogin() {
        return new MySqlLogin();
    }
}
