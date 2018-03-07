package com.msubscribe.javaSubscribe;

import android.util.Log;

/**
 * Created by admin on 2017/12/28.
 */

public class ConcreteObserver implements Observer{

    @Override
    public void sNotify() {
        Log.e("wjq","sNotify");
    }
}
