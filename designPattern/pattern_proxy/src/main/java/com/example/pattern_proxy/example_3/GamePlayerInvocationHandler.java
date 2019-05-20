package com.example.pattern_proxy.example_3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerInvocationHandler implements InvocationHandler {
    private Object object;

    public GamePlayerInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;
        result = method.invoke(this.object, objects);
        /**
         * 增加了执行代码
         */
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.println("代理登录游戏！");
        }
        return result;
    }
}
