package com.mproxy.staticproxy;

/**
 * 被代理类
 */

public class RealSubject implements ISubject {


    @Override
    public String doRequest() {
            return "真实请求";
    }
}
