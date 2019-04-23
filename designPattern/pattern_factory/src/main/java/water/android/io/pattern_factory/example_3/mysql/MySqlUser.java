package water.android.io.pattern_factory.example_3.mysql;

import water.android.io.pattern_factory.example_3.IUser;
import water.android.io.pattern_factory.example_3.bean.User;

public class MySqlUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("MySql insert an User");
    }

    @Override
    public User getUser() {
        System.out.println("MySql get an User.");
        return null;
    }
}
