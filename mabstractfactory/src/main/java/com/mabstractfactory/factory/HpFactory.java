package com.mabstractfactory.factory;

import com.mabstractfactory.product.HpKeyboard;
import com.mabstractfactory.product.HpMouse;
import com.mabstractfactory.product.Keyboard;
import com.mabstractfactory.product.Mouse;

/**
 * Created by admin on 2018/2/11.
 */

public class HpFactory extends PCFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
