package water.android.io.pattern_factory.example_3.oracle;

import water.android.io.pattern_factory.example_3.IUser;
import water.android.io.pattern_factory.example_3.bean.User;

public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("Oracle insert an User");
    }

    @Override
    public User getUser() {
        System.out.println("Oracle get an User.");
        return null;
    }
}
