package com.mstrategy;

/**
 * Created by admin on 2017/12/12.
 */

public class HalfPriceStrategy implements IPriceStrategy{


    @Override
    public float getPrice(float price) {
        return price * 0.5f;
    }
}
