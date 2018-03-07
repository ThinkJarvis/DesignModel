package com.mproxy.staticproxy;

/**
 * 设计模式： 静态代理
 *
 * 定义：     代理(Proxy)是一种设计模式,提供了对目标对象另外的访问方式;即通过代理对象访问目标对象.
 *
 * 应用场景： 在别人代码的基础上,需要对别人的代码进行拓展。
 *
 * 优点：     可以在目标对象实现的基础上,扩展额外的功能操作,即扩展目标对象的功能.
 */

/**
 * 代理类
 */

public class Proxy implements ISubject {

    private RealSubject mRealSubject;

    public Proxy() {
        mRealSubject = new RealSubject();
    }

    @Override
    public String doRequest() {
        if (mRealSubject != null)
            return "通过静态代理 " + mRealSubject.doRequest();
        else
            return "";
    }
}
