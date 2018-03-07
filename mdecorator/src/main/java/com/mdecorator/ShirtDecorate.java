package com.mdecorator;


/**
 * Created by admin on 2017/12/12.
 */

public class ShirtDecorate extends Decorator {


    public ShirtDecorate(IDecorator iDecorator) {
        super(iDecorator);
    }

    @Override
    public String dress() {
        return super.dress() + "穿衬衫";
    }
}
