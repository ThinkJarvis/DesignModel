package com.mfactorymethod;

/**
 * Created by admin on 2017/12/18.
 */

public class AddOperation extends IOperation{

    @Override
    public float getResult() {
        return mNumberA + mNumberB;
    }
}
