package com.mproxy.reflectproxy;

/**
 * Created by admin on 2017/12/14.
 */

public class RealSubject implements ISubject{

    @Override
    public String doRequest() {
        return "真实请求";
    }
}
