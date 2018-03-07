package com.msubscribe.delegateSubcribe;

import java.lang.reflect.InvocationTargetException;

/**
 * 设计模式： 观察者模式
 * 定义：     观察者模式（有时又被称为发布（publish ）-订阅（Subscribe）模式、模型-视图（View）模式、
 *            源-收听者(Listener)模式或从属者模式）是软件设计模式的一种。在此种模式中，一个目标物件
 *            管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观
 *            察者所提供的方法来实现。此种模式通常被用来实现事件处理系统
 *
 * 应用场景： 一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作
 *
 *
 *
 * 优点：    1、观察者和被观察者是抽象耦合的
 *           2、建立一套触发机制
 *
 * 缺点：    1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
 *           2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 *           3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化
 *
 */
public class ConcreteSubject implements Subject{

    protected EventHandler mHandler = new EventHandler();


    public void attach(Object object, String methodName, Object...args){
        mHandler.addEvent(object, methodName, args);
    }

    public void detach(Object object){
        mHandler.removeEvent(object);
    }

    @Override
    public void publish() {
        try {
            mHandler.handle();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
