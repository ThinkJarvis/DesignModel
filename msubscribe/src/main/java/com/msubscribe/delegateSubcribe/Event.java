package com.msubscribe.delegateSubcribe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by admin on 2018/1/9.
 */

public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        this.paramTypes = getParamTypes(args);
    }

    private Class[] getParamTypes(Object[] params) {
        if (params == null || params.length == 0)
            return null;
        Class[] types = new Class[params.length];
        for (int i = 0, len = params.length; i < len; i++) {
            types[i] = params[i].getClass();
        }
        return types;
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = this.object.getClass().getMethod(this.methodName, this.paramTypes);
        method.invoke(this.object, this.params);
    }
}
