package com.xiaomi.madapter;

import android.util.Log;

/**
 * Created by admin on 2018/2/13.
 */

public class ConcreteTarget implements Target{

    @Override
    public void request() {
        Log.e("wjq",this.getClass().getSimpleName() + " request");
    }
}
