package water.android.io.pattern_factory.example_3.oracle;

import water.android.io.pattern_factory.example_3.IFactory;
import water.android.io.pattern_factory.example_3.ILogin;
import water.android.io.pattern_factory.example_3.IUser;

public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public ILogin createLogin() {
        return new OracleLogin();
    }
}
