package com.mtemplatemethod;

import android.util.Log;

/**
 * Created by admin on 2017/12/23.
 */

public abstract class SuperClass {

    public abstract int operationNumA();
    public abstract int operationNumB();
    public abstract String  getDescription();

    public void templateMethod() {
        int num = operationNumA() + operationNumB();
        Log.e("wjq",getDescription() + " " + num);
    }
}
