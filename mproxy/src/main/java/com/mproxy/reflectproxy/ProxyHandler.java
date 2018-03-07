package com.mproxy.reflectproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by admin on 2017/12/14.
 */

public class ProxyHandler implements InvocationHandler{

    private Object mSubject;

    public ProxyHandler(Object subject) {
        mSubject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(mSubject, args);
        return "通过动态代理 " + result;
    }
}
