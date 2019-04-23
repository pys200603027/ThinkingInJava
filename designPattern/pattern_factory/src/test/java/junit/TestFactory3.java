package junit;

import org.junit.Test;

import water.android.io.pattern_factory.example_3.IFactory;
import water.android.io.pattern_factory.example_3.ILogin;
import water.android.io.pattern_factory.example_3.IUser;
import water.android.io.pattern_factory.example_3.mysql.MySqlFactory;

public class TestFactory3 {

    /**
     * 工厂模式：创建了工厂，在通过工厂获取数据和操作
     */
    @Test
    public void test1() {
        IFactory factory = new MySqlFactory();
        IUser user = factory.createUser();
        user.getUser();

        ILogin login = factory.createLogin();
        login.getLogin();
    }

    /**
     * 工厂模式,通过反射的方式获取工厂，在通过工厂创建数据和操作
     *
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void test2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IFactory factory = (IFactory) Class.forName("water.android.io.pattern_factory.example_3.oracle.OracleFactory").newInstance();
        IUser user = factory.createUser();
        user.getUser();
    }
}
