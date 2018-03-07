package com.mfactorymethod;

/**
 * Created by admin on 2017/12/18.
 */

public class SubFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new SubOperation();
    }
}
