package test.example;

import com.example.pattern_proxy.example_1.ProxySubject;
import com.example.pattern_proxy.example_1.RealSubject;
import com.example.pattern_proxy.example_1.Subject;
import com.example.pattern_proxy.example_2.DynamicProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class Test1 {

    /**
     * 静态代理
     */
    @Test
    public void test1() {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }

    @Test
    public void test2() {
        Subject subject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject sub = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, dynamicProxy);
        sub.visit();
    }
}
