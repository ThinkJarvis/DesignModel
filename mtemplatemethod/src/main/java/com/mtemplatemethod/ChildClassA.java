package com.mtemplatemethod;

/**
 * Created by admin on 2017/12/23.
 */

public class ChildClassA extends SuperClass {
    @Override
    public int operationNumA() {
        return 1;
    }

    @Override
    public int operationNumB() {
        return 1;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
