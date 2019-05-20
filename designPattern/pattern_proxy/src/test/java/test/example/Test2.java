package test.example;

import com.example.pattern_proxy.example_3.GamePlayer;
import com.example.pattern_proxy.example_3.GamePlayerInvocationHandler;
import com.example.pattern_proxy.example_3.IGamePlayer;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {

    /**
     * 动态代理模式(依赖JDK的形式)
     */
    @Test
    public void test1() {
        //第一层（实现层）
        IGamePlayer gamePlayer = new GamePlayer("Android");
        //代理层 (InvocationHandler)
        //为何不直接调用 gamePlayer,而是增加了代理层
        InvocationHandler invocationHandler = new GamePlayerInvocationHandler(gamePlayer);
        //建立层
        ClassLoader classLoader = invocationHandler.getClass().getClassLoader();
        IGamePlayer proxyPlayer = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, invocationHandler);
        //接口调用层
        proxyPlayer.login("X Men", "123");
        proxyPlayer.killBoss();
        proxyPlayer.upgrade();
    }
}
