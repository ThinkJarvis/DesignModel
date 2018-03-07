package com.mdecorator;


/**
 * Created by admin on 2017/12/12.
 */

public class ShoeDecorate extends Decorator{

    public ShoeDecorate(IDecorator iDecorator) {
        super(iDecorator);
    }

    @Override
    public String dress() {
        return super.dress() + "穿鞋子";
    }
}
