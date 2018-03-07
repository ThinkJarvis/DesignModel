package com.mstrategy;

/**
 * Created by admin on 2017/12/12.
 */

public class FullCutStrategy implements IPriceStrategy{


    @Override
    public float getPrice(float price) {
        return price - 10;
    }
}
