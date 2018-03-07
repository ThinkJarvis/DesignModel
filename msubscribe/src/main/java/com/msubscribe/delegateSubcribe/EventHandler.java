package com.msubscribe.delegateSubcribe;

import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by admin on 2018/1/9.
 */

public class EventHandler{

    private HashMap<Integer,Event> events = new HashMap<>();

    public void addEvent(Object object, String methodName, Object...args){
        events.put(object.hashCode(),new Event(object, methodName,args));
    }

    public void removeEvent(Object object){
        events.remove(object.hashCode());
    }

    public void handle() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
    {
        Iterator iterator = events.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iterator.next();
            Event event = (Event) entry.getValue();
            event.invoke();
        }
    }
}
