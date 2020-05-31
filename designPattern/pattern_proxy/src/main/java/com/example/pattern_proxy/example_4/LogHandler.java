package com.example.pattern_proxy.example_4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Start..");
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
        }
        System.out.println();


        Object ret = null;

        System.out.println("Start-->");
        ret = method.invoke(targetObject, objects);
        System.out.println("End-->");

        return ret;
    }
}
