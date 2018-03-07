package com.mtemplatemethod;

/**
 * Created by admin on 2017/12/23.
 */

public class ChildClassB extends SuperClass {
    @Override
    public int operationNumA() {
        return 2;
    }

    @Override
    public int operationNumB() {
        return 2;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
