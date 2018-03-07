package com.xiaomi.madapter;

/**
 * Created by admin on 2018/2/13.
 */

public class ObjectAdapter implements Target{

    private Adaptee mAdaptee = new Adaptee();


    @Override
    public void request() {
        mAdaptee.doRequest();
    }
}
