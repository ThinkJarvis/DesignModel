package com.mabstractfactory.product;

/**
 * Created by admin on 2018/2/11.
 */

public abstract class Product {

    public String build() {
        return  getDescription() + " build";
    }

    protected String getDescription() {
        return this.getClass().getSimpleName();
    }
}
