package water.android.io.a14.c_14_8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/**
 * 动态代理+Null对象
 */
public class NullRobot {
    public static Robot newNUllRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(NullRobot.class.getClassLoader(), new Class[]{Null.class, Robot.class}, new NullRobotProxyHandler(type));
    }

    public static void main(String[] args) {
        Robot[] bot = {new SnowRemovalRobot("SnowBee"), newNUllRobot(SnowRemovalRobot.class)};
        for (Robot b : bot) {
            Robot.Test.test(b);
        }
    }
}

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(proxied, objects);
    }

    private class NRobot implements Null, Robot {

        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String mode() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }
}
