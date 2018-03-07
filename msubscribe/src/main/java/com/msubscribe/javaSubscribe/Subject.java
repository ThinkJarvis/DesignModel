package com.msubscribe.javaSubscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/12/28.
 */

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void publish() {
        for(Observer observer : observers) {
            observer.sNotify();
        }
    }
}
