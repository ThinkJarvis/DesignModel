package com.mfactorymethod;

/**
 * Created by admin on 2017/12/18.
 */

public class AddFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new AddOperation();
    }
}
