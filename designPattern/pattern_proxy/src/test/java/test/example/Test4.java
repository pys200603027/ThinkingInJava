package test.example;

import com.example.pattern_proxy.example_4.LogHandler;
import com.example.pattern_proxy.example_4.UserManager;
import com.example.pattern_proxy.example_4.UserManagerImpl;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class Test4 {

    @Test
    public void test1() {
        LogHandler logHandler = new LogHandler();

        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());

        userManager.addUser("9527", "t");
    }


    @Test
    public void test2() {

        UserManagerImpl userManagerImpl = new UserManagerImpl();
        UserManager userManager = (UserManager) Proxy.newProxyInstance(userManagerImpl.getClass().getClassLoader(), userManagerImpl.getClass().getInterfaces(), (o, method, objects) -> {
//            System.out.println(o);

            System.out.println("start..");
            Object result = method.invoke(userManagerImpl, objects);
            System.out.println("end..");
            return result;
        });

        userManager.delUser("9527");
    }
}
